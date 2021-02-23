package org.itstep.selenium.Lesson6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TestSelect {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("C:\\Users\\Lukashyk\\IdeaProjects\\SeleniumQA2020\\src\\main\\resources\\select.html");

        // WebElement selectElement =
        // webDriver.findElement(By.cssSelector("body > form > select > option:nth-child(4)"));//выбраный элемент
        WebElement selectElement =
                webDriver.findElement(By.cssSelector("body > form > select:nth-child(3)"));//select
        Select select = new Select(selectElement);
        List<WebElement> options = select.getOptions();
        String[] countries = {"USA", "Ukraine", "Russia","China"};

        if (options.size() == countries.length) {
            for (int i = 0; i < options.size(); i++) { //options.length
                WebElement webElement = options.get(i);//options[i]
                if(options.get(i).getText().equals(countries[i])){
                    System.out.println("Exp " + options.get(i).getText() +  " actual " + countries[i]);
                }
            }
        }else {
            System.out.println("Exp size = " + options.size() +  " actual size =  " + countries.length);
        }

        System.out.println("=====Selected elements=======");

        select.selectByIndex(1);
        select.selectByIndex(2);

        List<WebElement> allSelectedOptions = select.getAllSelectedOptions();

        for (WebElement selectionEl : allSelectedOptions) {
            System.out.println(selectionEl.getText());
        }
        webDriver.quit();
        System.out.println("Ок");

    }
}
