package org.itstep.selenium.Lesson13.google_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Function;

public class GooglePage extends Page{

    @FindBy(how = How.NAME, using = "q")
    WebElement q;

    @FindBy(id = "result-stats")
    WebElement resultStats;

    private String url;

    public GooglePage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String query(String text){
        super.webDriver.get(url);
        //q = webDriver.findElement(By.tagName("q"));//заменяем аннотацией @FindBy
        q.sendKeys(text);
        q.submit();
        new WebDriverWait(webDriver, 10)
                .until(webDriver -> webDriver.findElement(By.id("result-stats")));
        return resultStats.getText();
    }

    public static void main(String[] args) {
        System.out.println("Start test");
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        GooglePage googlePage = PageFactory.initElements(webDriver, GooglePage.class);
        googlePage.setUrl("https://google.com");
        String expected = "Результатов: примерно ";
        String actual = googlePage.query("роликовые коньки бесплатно днепр olx");
        System.out.println(actual.contains(expected));
        webDriver.quit();
        System.out.println("End test");
    }
}
