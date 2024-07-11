package com.epam.manjula_chakravakam.optional_task2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class Task2 {
    @Test
    public void createNewPaste() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://pastebin.com/");

        //Code
        String code = "git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force";
        WebElement pasteData = driver.findElement(By.id("postform-text"));
        pasteData.sendKeys(code);
        String getpaste=pasteData.getAttribute("value");




        //Syntax Highliting
        WebElement syntaxHighliting = driver.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[3]/div/span/span[1]/span/span[2]"));
        syntaxHighliting.click();
        WebElement selectElement = driver.findElement(By.xpath("//li[text()='Bash']"));
        String selectedValue = selectElement.getText();
        selectElement.click();



        //PageExpiration
        WebElement pageExpirationDropDown = driver.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[4]/div/span/span[1]/span/span[2]"));
        pageExpirationDropDown.click();
        WebElement pageExpiration = driver.findElement(By.xpath("//li[text()='10 Minutes']"));
        pageExpiration.click();

        //Paste name/title
        String pasteName = "how to gain dominance among developers";
        WebElement pasteNameElem = driver.findElement(By.id("postform-name"));
        pasteNameElem.sendKeys(pasteName);

        //click Create new paste
        WebElement createPasteBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        createPasteBtn.click();


        //Checking data elements
        Assert.assertEquals(pasteNameElem.getAttribute("value"), pasteName);
        Assert.assertEquals(selectedValue,"Bash");
        Assert.assertEquals(code,getpaste);


        driver.quit();
    }


}