package org.itstep.selenium.Lesson10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.security.Key;
import java.util.List;

public class ActionsTest {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        System.out.println("Start test");
        String str = "C:\\Users\\Lukashyk\\IdeaProjects\\SeleniumQA2020\\src\\main\\resources\\actions.html";
        webDriver.get(str);
        Actions actions = new Actions(webDriver);
        try {
            List<WebElement> li = webDriver.findElements(By.tagName("li"));//получаю список всех элемнтов
            actions
                    .click(li.get(1))//кликаю по второму элменту
                    .keyDown(Keys.CONTROL)//нажатие на клавишу control
                    .moveToElement(li.get(6))//двигаемся к нужному эл-ту
                    .pause(2000)//пауза 2 сек
                    .click()
                    .perform();//метод запускает выполнение

        } catch (Exception e) {
            e.printStackTrace();
        }
        webDriver.quit();

    }
}
