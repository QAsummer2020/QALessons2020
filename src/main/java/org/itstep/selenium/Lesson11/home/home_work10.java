package org.itstep.selenium.Lesson11.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

//        #. Запустить браузер
//        #. Открыть файл “windows.html”
//        #. Получить имя текущего окна (используя метод getWindowHandle)
//        #. Кликнуть по кнопке “New Browser Window”, что приведет к появлению нового окна браузера
//        #. Получить title окна - должен быть "Компьютерная Академия ШАГ Днепр – №1 на рынке IT-образования Украины"
//        #. Кликнуть по кнопке “New Browser Tab”, что приведет к появлению вкладки браузера
//        #. Получить все открытые окна и вывести их заголовки на консоль (использйте метод getWindowHandles)
//        #. Закрыть последовательно все окна
//        #. Закрыть браузер
public class home_work10 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("C:\\Users\\Lukashyk\\IdeaProjects\\SeleniumQA2020\\src\\main\\resources\\window.html");

        WebElement btn = webDriver.findElement(By.cssSelector("#button1"));
        String main = webDriver.getWindowHandle();
        System.out.println("First page =" + main);

        showWindowsEach(webDriver.getWindowHandles());

        btn.click();
        Thread.sleep(2000);
        showWindowsEach(webDriver.getWindowHandles());


        String secondPgeHandle = "";
        for (String windowHandle : webDriver.getWindowHandles()) {
            secondPgeHandle = windowHandle;
            if (!windowHandle.equals(main)) {
                break;
            }

        }
        System.out.println("Second page = " + secondPgeHandle);
        WebDriver window = webDriver.switchTo().window(secondPgeHandle);
        if (window.getTitle().equals("Компьютерная Академия ШАГ Днепр – №1 на рынке IT-образования Украины")) {
            System.out.println("Passed");
        } else {
            System.err.println("Error Title - " + window.getTitle());
        }

        webDriver.switchTo().window(main);

        WebElement btn1 = webDriver.findElement(By.cssSelector("#content > p:nth-child(5) > button"));

        //showWindowsEach(webDriver.getWindowHandles());

        btn1.click();
        Thread.sleep(2000);
        //showWindowsEach(webDriver.getWindowHandles());


        String thirdPgeHandle = "";
        for (String windowHandle : webDriver.getWindowHandles()) {
            System.out.println(windowHandle);
            thirdPgeHandle = windowHandle;
            //if (!windowHandle.equals(main) && !windowHandle.equals(secondPgeHandle) ){
           // break;
           // }
        }
        System.out.println("The third page = " + thirdPgeHandle);

        webDriver.quit();
        System.out.println("End test");
    }

    public static void showWindowsEach(Set<String> windowHandles) {
        //System.out.println("window size = " + windowHandles.size());
        for (String windowHandle : windowHandles) {
            //System.out.println("handler = " + windowHandle);
        }
    }
}
