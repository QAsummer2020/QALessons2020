package org.itstep.selenium.Lesson11.classworck;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RobotExample {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://itstep.dp.ua/ru");
        System.out.println("Start test");

        //JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        //executor.executeScript("alert('Hello from selenium')");
        //executor.executeScript("window.location = 'http://google.com'");
        //webDriver.manage().window().fullscreen();//F11

        webDriver.manage().window().maximize();

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_F11);
        robot.keyRelease(KeyEvent.VK_F11);
        for (int i = 0; i < 20; i++) {
            robot.mouseWheel(i);
            robot.delay(500);
        }

        WebElement element = webDriver.findElement(By.cssSelector("#academy_app > main > section.home-events > a"));
        int x = element.getLocation().getX();
        int y = element.getLocation().getY();
        //int x = ((Locatable) element).getCoordinates().inViewPort().getX();
        //int y = ((Locatable) element).getCoordinates().inViewPort().getY();

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        robot.mouseMove(x + 5, y + 5);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);//click()
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
        webDriver.quit();
        System.out.println("End test");
    }
}
