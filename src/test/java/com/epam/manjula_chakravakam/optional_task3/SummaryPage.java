package com.epam.manjula_chakravakam.optional_task3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummaryPage {

    WebDriver driver;
    SummaryPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy( xpath = "//span[contains(text(), 'Number of Instances')]/following-sibling::span")
    private  WebElement numberOfInstances;

    @FindBy( xpath = "//span[contains(text(), 'Operating System / Software')]/following-sibling::span")
    private  WebElement operatingSystem;

    @FindBy( xpath = "//span[contains(text(), 'Provisioning Model')]/following-sibling::span")
    private WebElement provisioningModel;

    @FindBy( xpath = "//span[contains(text(), 'Machine type')]/following-sibling::span")
    private WebElement machineType;

    @FindBy( xpath = "//span[contains(text(), 'Add GPUs')]/following-sibling::span")
    private WebElement gpuToggle;

    @FindBy( xpath = "//span[contains(text(), 'GPU Model')]/following-sibling::span")
    private WebElement gpuModel;

    @FindBy( xpath = "//span[contains(text(), 'Number of GPUs')]/following-sibling::span")
    private WebElement numberOfGpus;

    @FindBy( xpath = "//span[contains(text(), 'Local SSD')]/following-sibling::span")
    private WebElement localSsd;

    @FindBy( xpath = "//span[contains(text(), 'Region')]/following-sibling::span")
    private WebElement region;

    @FindBy( xpath = "//span[contains(text(), 'Committed use discount options')]/following-sibling::span")
    private WebElement commitedUse;

    public String getNumberOfInstances() {
        return numberOfInstances.getText();
    }

    public String getOperatingSystem() {
        return operatingSystem.getText();
    }

    public String getProvisioningModel() {
        return provisioningModel.getText();
    }

    public String getMachineType() {
        return machineType.getText();
    }

    public String getGpuToggle() {
        return gpuToggle.getText();
    }

    public String getGpuModel() {
        return gpuModel.getText();
    }

    public String getNumberOfGpus() {
        return numberOfGpus.getText();
    }

    public String getLocalSsd() {
        return localSsd.getText();
    }

    public String getRegion() {
        return region.getText();
    }

    public String getCommitedUse() {
        return commitedUse.getText();
    }

}