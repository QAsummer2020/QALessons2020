package org.itstep.selenium.Lesson11.home;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW9 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("C:\\Users\\Lukashyk\\IdeaProjects\\SeleniumQA2020\\src\\main\\resources\\window.html");
        System.out.println("Start test");

        WebElement button = null;
        try {
            String h1 = webDriver.getWindowHandle();
            System.out.println("First handle = " + h1);
            button = webDriver.findElement(By.cssSelector("#button1"));
            button.click();
            Thread.sleep(2000);
            String secondPgeHandle = "";
            for (String windowHandle : webDriver.getWindowHandles()) {
                secondPgeHandle = windowHandle;
                if (!windowHandle.equals(h1)) {
                    break;
                }
            }

            WebDriver window = webDriver.switchTo().window(secondPgeHandle);

            System.out.println("Second page title " + window.getTitle());
            HW9.test("Компьютерная Академия ШАГ Днепр – №1 на рынке IT-образования Украины", window.getTitle());

            WebDriver mainWindow = webDriver.switchTo().window(h1);
            button = mainWindow.findElement(By.cssSelector("#content > p:nth-child(5) > button"));
            button.click();
            Thread.sleep(2000);
            for (String windowHandle : webDriver.getWindowHandles()) {
                System.out.println(windowHandle);
                WebDriver currentWindow = webDriver.switchTo().window(windowHandle);
                Thread.sleep(500);
                currentWindow.close();
            }
        } catch (NoSuchElementException | InterruptedException e) {
            System.out.println("Элемент не найден");

        }

    }
    public static void test (String expectedText, String actualText){
        if (expectedText.equals(actualText)) {
            System.out.println("Pass");
        } else {
            System.out.println("Error");
        }
    }
}

