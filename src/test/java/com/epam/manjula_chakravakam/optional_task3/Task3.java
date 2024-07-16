package com.epam.manjula_chakravakam.optional_task3;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;

public class Task3{
    private WebDriver driver;
    CalculatorPage calculatorPage;
    SummaryPage summaryPage;

    String numberOfInstances = "4";
    String operatingSystem = "Free: Debian, CentOS, CoreOS, Ubuntu or BYOL (Bring Your Own License)";
    String provisioningModel = "Regular";
    String machineFamily = "General Purpose";
    String series = "N1";
    String machineType = "n1-standard-8 vCPUs: 8, RAM: 30 GB";
    String gpuModel = "NVIDIA Tesla V100";
    String numberOfGPUs =  "1";
    String localSSD =  "2x375 GB";
    String region = "Netherlands (europe-west4)";
    String commitedUse =  "1 year";


    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://cloud.google.com/products/calculator");
    }

    @Test
    public void createCalculation() throws InterruptedException {
        calculatorPage = new CalculatorPage(driver);
        calculatorPage.calculate(
                numberOfInstances,
                machineType,
                gpuModel,
                localSSD,
                region,
                commitedUse);

        // switching tabs
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        summaryPage = new SummaryPage(driver);

        // checking number of instances
        String expectedNumberOfInstances = numberOfInstances;
        String actualNumberOfInstances = summaryPage.getNumberOfInstances() ;
        Assert.assertEquals( expectedNumberOfInstances , actualNumberOfInstances );

        // checking operating system
        String expectedOperatingSystem = operatingSystem;
        String actualOperatingSystem = summaryPage.getOperatingSystem();
        Assert.assertEquals( expectedOperatingSystem , actualOperatingSystem);

        // checking provisioning model
        String expectedProvisioningModel = provisioningModel;
        String actualProvisioningModel = summaryPage.getProvisioningModel();
        Assert.assertEquals(expectedProvisioningModel, actualProvisioningModel);

        // checking machine type
        String expectedMachineType = "n1-standard-8, vCPUs: 8, RAM: 30 GB";
        String actualMachineType = summaryPage.getMachineType() ;
        Assert.assertEquals(expectedMachineType, actualMachineType);

        // checking Select GPU Toggle
        String expectedGpuToggle = "true";
        String actualGpuToggle = summaryPage.getGpuToggle();
        Assert.assertEquals(expectedGpuToggle, actualGpuToggle);

        // checking GPU model
        String expectedGpuModel = "NVIDIA V100";
        String actualGpuModel = summaryPage.getGpuModel() ;
        Assert.assertEquals(expectedGpuModel, actualGpuModel);

        // checking Number of Gpus
        String expectedNumberOfGpus = numberOfGPUs;
        String actualNumberOfGpus = summaryPage.getNumberOfGpus() ;
        Assert.assertEquals(expectedNumberOfGpus, actualNumberOfGpus);

        // checking Local SSD
        String expectedLocalSsd = localSSD;
        String actualLocalSsd = summaryPage.getLocalSsd() ;
        Assert.assertEquals(expectedLocalSsd, actualLocalSsd);

        // checking Region
        String expectedRegion = region;
        String actualRegion = summaryPage.getRegion() ;
        Assert.assertEquals(expectedRegion, actualRegion);

        // checking Commited use discount options
        String expectedCommitedUse = commitedUse;
        String actualCommitedUse = summaryPage.getCommitedUse() ;
        Assert.assertEquals(expectedCommitedUse, actualCommitedUse);

    }



    @AfterClass
    public void close() {
        driver.quit();
    }
}

