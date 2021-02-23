package org.itstep.selenium.Lesson7;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        System.out.println("Start test");

        webDriver.get("C:\\Users\\Lukashyk\\IdeaProjects\\SeleniumQA2020\\src\\main\\resources\\windows.html");

        WebElement button = null;
        try {
            button = webDriver.findElement(By.cssSelector("#alert > button"));
            button.click();

            WebDriver.TargetLocator targetLocator = webDriver.switchTo();//TargetLocator позволяет переключаться между окнами
            Alert alert = targetLocator.alert();//вызываем метод alert() чтоб получить обьект Alert

            String expectedText = "It is simple alert";
            String actualText = alert.getText();

            if(expectedText.equals(actualText)){
                System.out.println("Passed");
            }else {
                System.out.println("Модальное окно содержит текст " + actualText);
            }
            alert.accept();



            System.out.println("Все прошло хорошо");
        }catch (NoSuchElementException e){
            System.out.println("Элемент не найден");
        }
        webDriver.quit();

        System.out.println("End test");
    }
}
