import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriver driver;
    public BasePage(WebDriver driver){
         this.driver = driver;
    }
    public WebElement getElementByXpath(String locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
        return driver.findElement(By.xpath(locator));
    }
}
