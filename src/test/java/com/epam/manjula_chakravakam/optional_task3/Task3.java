package com.epam.manjula_chakravakam.optional_task3;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Task3{

    @Test
    public void estimateCost() throws InterruptedException, AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.get("https://cloud.google.com/products/calculator");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[text()='Add to estimate']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//p[contains(text(),'A secure and customizable compute service that let')]")).click();
        Thread.sleep(3000);

        WebElement ss = driver.findElement(By.xpath("//div[@class='QiFlid']//div[@jsaction='JIbuQc:qGgAE']//div[@class='wX4xVc-Bz112c-RLmnJb']"));
        for (int i = 0; i < 3; i++) {
            ss.click();
        }
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//div[@class='VfPpkd-aPP78e'])[4]")).click();
        Robot rb = new Robot();
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//label[normalize-space()='Regular']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='VfPpkd-aPP78e'])[5]")).click();
        Thread.sleep(3000);
        rb.keyPress(KeyEvent.VK_ENTER);      //machine family
        rb.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//div[@class='VfPpkd-aPP78e'])[6]")).click();
        Thread.sleep(3000);

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);   //series
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//div[@class='VfPpkd-aPP78e'])[7]")).click();
        Thread.sleep(3000);

        rb.keyPress(KeyEvent.VK_DOWN);
        rb.keyRelease(KeyEvent.VK_DOWN);     //machine type
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//span[@class='eBlXUe-hywKDc'])[6]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//div[@class='VfPpkd-aPP78e'])[8]")).click();
        Thread.sleep(3000);

        rb.keyPress(KeyEvent.VK_DOWN);
        rb.keyRelease(KeyEvent.VK_DOWN);     //gpu type
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//div[@class='VfPpkd-aPP78e'])[9]")).click();
        Thread.sleep(3000);

        rb.keyPress(KeyEvent.VK_ENTER);     //gpus
        rb.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//div[@class='VfPpkd-aPP78e'])[10]")).click();
        Thread.sleep(3000);

        rb.keyPress(KeyEvent.VK_DOWN);
        rb.keyRelease(KeyEvent.VK_DOWN);//ssd

        rb.keyPress(KeyEvent.VK_DOWN);
        rb.keyRelease(KeyEvent.VK_DOWN);

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//div[@class='VfPpkd-aPP78e'])[11]")).click();
        Thread.sleep(3000);

        rb.keyPress(KeyEvent.VK_DOWN);
        rb.keyRelease(KeyEvent.VK_DOWN);

        rb.keyPress(KeyEvent.VK_DOWN);
        rb.keyRelease(KeyEvent.VK_DOWN);

        rb.keyPress(KeyEvent.VK_DOWN);
        rb.keyRelease(KeyEvent.VK_DOWN);

        rb.keyPress(KeyEvent.VK_DOWN);
        rb.keyRelease(KeyEvent.VK_DOWN);          //netherlands

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//label[normalize-space()='1 year']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[@class='FOBRw-vQzf8d']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[normalize-space()='Open estimate summary']")).click();
        Thread.sleep(3000);

        driver.quit();

    }
}
