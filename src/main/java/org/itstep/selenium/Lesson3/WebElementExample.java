package org.itstep.selenium.Lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebElementExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        String url = "file:///C:/Users/Lukashyk/IdeaProjects/SeleniumQA2020/index.html";

        System.out.println("Start test");
        webDriver.get(url);

        //WebElement h2 = webDriver.findElement(By.tagName("h2"));//для однго эл-та
        List<WebElement> h2 = webDriver.findElements(By.tagName("h2"));//для нескольких эл-тов

        for(WebElement w : h2) {
            System.out.println("text = " + w.getText());
            System.out.println("tagName = " + w.getTagName());
            System.out.println("size = " + w.getSize());
            System.out.println("display = " + w.isDisplayed());
            w.clear();
            System.out.println("==========================");
        }
        webDriver.quit();
        System.out.println("End test");

    }
}
