package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.puriholidayresort.com/");
        driver.findElement(By.xpath("//*[@id='myModal_home']/div/div/div[1]/button")).click();
        driver.findElement(By.xpath("//*[@id='arr_datepicker']")).sendKeys("2024-05-16");
        System.out.println("Hello World!");
    }
}
