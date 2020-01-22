import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class ArListDziecko {

    WebDriver driver;

    @BeforeEach
    public void driverSetup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
    }

    @AfterEach
    public void driverQuit() {

        driver.quit();
    }

    @Test
    public void getElement() {
        Collection<String> urlstoTest = TestData.getUrlsToTest();
        for(String url : urlstoTest){
            WebElement element = test(url);
            assertTrue(element.isDisplayed());
        }
    }



    public WebElement test(String url) {
        driver.get(url);
        return driver.findElement(By.xpath("//div[@id=\"001-TOPBOARD\"]//span"));
    }

    public static void main(final String[] args) {
//        List<String> kidList =
//        kidList.add("http://www.edziecko.pl/przed_ciaza/1,79569,11918046,Planowanie_ciazy___krok_po_kroku.html");
//        System.out.println(kidList);
//        System
    }
}
