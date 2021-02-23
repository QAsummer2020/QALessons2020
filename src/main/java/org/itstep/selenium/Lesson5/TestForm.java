package org.itstep.selenium.Lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestForm {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.navigate().to("http://localhost:8080");

        WebElement login = webDriver.findElement(By.name("login"));
        WebElement password = webDriver.findElement(By.name("password"));

        webDriver.findElement(By.cssSelector("#result-stats"));

        login.sendKeys("admin");//передает данные в форму
        password.sendKeys("qwert");
        password.submit();//нажать на кнопку отправитья

        //password.clear();//очищает форму

        System.out.println(webDriver.getCurrentUrl());
        System.out.println(webDriver.getTitle());

        Thread.sleep(2000);
        System.out.println("ok");
        webDriver.quit();
    }
}
