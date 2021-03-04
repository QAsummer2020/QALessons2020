package org.itstep.selenium.Lesson12;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application {
        public static void main(String[] args)  {
            System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver_win32 (1)\\chromedriver.exe");
            WebDriver webDriver = new ChromeDriver();
            webDriver.get("C:\\Users\\Lukashyk\\IdeaProjects\\SeleniumQA2020\\src\\main\\resources\\waits.html");
            System.out.println("Start test");


            System.out.println("End test");

            Assert.assertEquals("10", "10");




    }
}
