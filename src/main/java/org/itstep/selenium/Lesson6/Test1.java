package org.itstep.selenium.Lesson6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.navigate().to("https://itstep.dp.ua/ru/contacts");

        WebElement element = webDriver.findElement(By.cssSelector("#form_construct_main > div > div:nth-child(1) > input"));
        String placeholder = element.getAttribute("placeholder");
        System.out.println(placeholder);


    }
}
