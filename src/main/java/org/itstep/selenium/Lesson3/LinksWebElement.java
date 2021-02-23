package org.itstep.selenium.Lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksWebElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        String url = "file:///C:/Users/Lukashyk/IdeaProjects/SeleniumQA2020/index.html";

        webDriver.get(url);

        //webDriver.findElement(By.partialLinkText("Google")).click();
        webDriver.findElement(By.linkText("Google link")).click();
        String expectedUrl = webDriver.getCurrentUrl();
        if(expectedUrl.equals("http://google.com")){
            System.out.println("Pass");
        }else {
            System.err.println("Error");
        }
    }
}
