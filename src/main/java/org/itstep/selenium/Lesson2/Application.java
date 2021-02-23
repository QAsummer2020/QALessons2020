package org.itstep.selenium.Lesson2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
//        webDriver.get("http://google.com");
//        System.out.println("Ok");
//        webDriver.quit();


        // old test
//        System.out.println("Start test");
//        webDriver.navigate().to("http://gismeteo.ua");
//        System.out.println("Loaded gismeteo.ua " + webDriver.getCurrentUrl());
//        Thread.sleep(1000);
//
//        webDriver.navigate().to("http://olx.ua");
//        System.out.println("Loaded olx.ua " + webDriver.getCurrentUrl());
//        Thread.sleep(1000);
//
//        webDriver.navigate().to("http://logbook.itstep.org");
//        System.out.println("Loaded logbook.itstep.org " + webDriver.getCurrentUrl());
//        Thread.sleep(1000);
//
//        webDriver.navigate().back();
//        System.out.println("Back to olx.ua " + webDriver.getCurrentUrl());
//        Thread.sleep(1000);
//
//        webDriver.navigate().back();
//        System.out.println("Back to gismeteo.ua" + webDriver.getCurrentUrl());
//        Thread.sleep(1000);
//
//        webDriver.navigate().forward();
//        System.out.println("Forward to olx.ua " + webDriver.getCurrentUrl());
//        Thread.sleep(1000);


        // new test

        String[] urls = {"http://gismeteo.ua",
                "http://olx.ua",
                "http://logbook.itstep.org"};

        System.out.println("Start test");

//        for (int i = 0; i < urls.length; i++) {
//            webDriver.navigate().to(urls[i]);
//            System.out.println("Loaded " + webDriver.getCurrentUrl());
//            Thread.sleep(1000);
//        }

        for (String url : urls) {
            webDriver.navigate().to(url);
            System.out.println("Loaded " + webDriver.getCurrentUrl());
            Thread.sleep(1000);
        }

        for (int i = urls.length-1; i > 0; i--) {
            webDriver.navigate().back();
            System.out.println("Back-" + urls[i-1] + " " + webDriver.getCurrentUrl());

        }
        webDriver.navigate().forward();
        System.out.println("Forward to olx.ua " + webDriver.getCurrentUrl());



        webDriver.quit();
        System.out.println("End test");

    }
}
