package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tests.BaseTest;

public class MainPage extends BaseTest {
    private  WebDriver driver;

    By uniqueName =By.name("q");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://google.com");
    }

    public void typeQuery(String queryForSearch) {
        WebElement element = driver.findElement(uniqueName);
        element.sendKeys(queryForSearch);
    }

    public void submitQuery() {
        WebElement element = driver.findElement(uniqueName);
        element.submit();
    }
}
