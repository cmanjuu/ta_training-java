package com.epam.manjula_chakravakam.optional_task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {

        WebDriver webDriver=new ChromeDriver();
        webDriver.get("https://pastebin.com/");
        webDriver.manage().window().maximize();
        webDriver.findElement(By.id("postform-text")).sendKeys("Hello from WebDriver");
        webDriver.findElement(By.id("select2-postform-expiration-container")).click();
        webDriver.findElement(By.xpath("//li[text()='10 Minutes']")).click();
        webDriver.findElement(By.id("postform-name")).sendKeys("helloWeb");
        webDriver.findElement(By.cssSelector("button[type='submit']")).click();
    }
}
