package Learning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestInit {
    WebDriver driver;
    @BeforeMethod
    public void starteri(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public void openZakaz(){
        driver.get("https://zakaz.ua/uk/");
    }

    /*@AfterMethod
    public void setDown(){
        driver.quit();
    }
    */

    @Test
    public void sleep(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void openAtb()
    {
        driver.get("https://zakaz.atbmarket.com");
    }
    public void zakaz2Start()
    {
        driver.get("https://zakaz.atbmarket.com");
        driver.findElement(By.xpath("//button[contains(text(), 'Оберіть спосіб доставки')]")).click();
        driver.findElement(By.xpath("//select[@name='region']")).click();
        driver.findElement(By.xpath("//option[@value='31']")).click();
        driver.findElement(By.xpath("//select[@id='city']")).click();
        driver.findElement(By.xpath("//option[@value='395']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Самовивіз із магазину')]")).click();
        driver.findElement(By.xpath("//button[@class='js-btn-continue custom-blue-btn city-modal__continue-btn']")).click();
    }
    public void zakaz2Main1(){
        driver.findElement(By.xpath("//span[@class='select2-selection__arrow']")).click();
        driver.findElement(By.xpath("//input[@aria-autocomplete='list']")).click();
        driver.findElement(By.xpath("//input[@aria-autocomplete='list']")).sendKeys("бул. Праці, 6/14\n");
    }
    public void zaka2Main2()
    {
        driver.findElement(By.xpath("//a[@href='/catalog/1108/343'][@class='sticky-header__category-link']")).click();
    }
    public void zakaz2Main3()
    {
        driver.findElement(By.xpath("//a[contains(text(),' Яйце куряче 10 шт Україна 1 категорія фас ')]")).click();
        driver.findElement(By.xpath("//button[@class='b-addToCart__basket-btn'][@type='button'][@aria-label='Добавить товар']")).click();
    }
    public void zaka2End()
    {
        for (int i = 0; i < 9; i++) {
            driver.findElement(By.xpath("//button[@class='b-addToCart__btn b-addToCart__btn--plus'][@type='button'][@aria-label='Добавить товар']")).click();
        }
    }

}
