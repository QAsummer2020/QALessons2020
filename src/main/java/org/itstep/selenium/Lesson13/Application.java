package org.itstep.selenium.Lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Application {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver webDriver = null;

        try {
            webDriver = new ChromeDriver();
            webDriver.get("C:\\Users\\Lukashyk\\IdeaProjects\\SeleniumQA2020\\src\\main\\resources\\waits.html");
            System.out.println("Start test");

            //implicitlyWait - явное ожидание
            webDriver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
            WebElement h1 = webDriver.findElement(By.tagName("h1"));
            if(!h1.getText().equals("Hello selenium")){
                System.err.println("Error");
            }else {
                System.out.println("Pass");
            }
            System.out.println("End test");
        }catch (Exception exception){
            exception.getMessage();
        }finally {
            assert webDriver != null;
            webDriver.quit();
        }


        System.out.println("OK");
    }
}