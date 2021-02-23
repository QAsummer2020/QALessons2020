package org.itstep.selenium.Lesson10;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Hw {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        System.out.println("Start test");
        webDriver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
        System.out.println("Начинаем тесты");
        String firstTitle = webDriver.getTitle();
        System.out.println("Title начальной страницы=" + firstTitle);


        WebElement iframe = null;

        iframe = webDriver.findElement(By.cssSelector("#iframeResult"));


        WebDriver frame = webDriver.switchTo().frame(iframe); //переходим на iframe для поиска нужного title

        //String code = frame.getPageSource(); // получаем код страницы в котором есть искомый title

        WebDriver frame1 = webDriver.switchTo().frame(0);

        // System.out.println(frame1.getPageSource());

        String code = frame1.getPageSource();

        //System.out.println("Код страницы с искомым TITLE= " + code); //выводим код в консоль

        int index = code.indexOf("W3Schools Online Web Tutorials");

        System.out.println("index = " + index);// находим индекс начала искомого title он равен 127 с длинной 35

        String sub = code.substring(index, index + 30); //выводим данный title указывая начальный и конечный инднкс в коде
        System.out.println("Искомый TITLE= " + sub);

//        WebElement element = webDriver.findElement(By.cssSelector("body > iframe:nth-child(2)"));
//        System.out.println("Искомый TITLE= " + element.getText());

        boolean isContain = code.contains("W3Schools Online Web Tutorials"); //ищем  title из задания
        System.out.println(isContain);// если нашел - выведет true (но title уже изменен)

        webDriver.quit();
        System.out.println("Закончили тесты");

    }
}
