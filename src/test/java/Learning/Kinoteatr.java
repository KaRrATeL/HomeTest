package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Kinoteatr extends BasePage {
    public Kinoteatr(WebDriver driver){

        super(driver);
    }
    @Test
    public void sleep(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void openKino()
    {
        driver.get("https://multiplex.ua/ru/");
    }
    @Test
    public void clickAcceptRegion(){
        driver.findElement(By.xpath("//p[@class='yes']")).click();
    }
    @Test
    public void clickToMenu()
    {
        driver.findElement(By.xpath("//img[@class='menu-btn']")).click();
    }
    @Test
    public void clickSoonFilms()
    {
        driver.findElement(By.xpath("//a[contains(text(), 'Скоро в прокате')]")).click();
    }
    @Test
    public void clickOnChooseFilm(){
        driver.findElement(By.xpath("//div[@style='background-image: url(/images/db/93/db9340eb28552055da622e6aea28f278.jpeg);']")).click();
    }
    @Test
    public void watchTrailerFilm(){
    driver.findElement(By.xpath("//h2[@id='desktop_trailer']")).click();
    }
  @Test
    public void clickChooseCinema()
  {
      driver.findElement(By.xpath("//a[@href='/ru/cinemas']")).click();
  }
  @Test
    public void chooseCityCinema()
  {
      driver.findElement(By.xpath("//div[@id='mark_kv']")).click();
  }
  @Test
    public void transportationToListCinemaOfChooseCity()
  {
      driver.findElement(By.xpath("//*[@data-reg='Київ']")).click();
  }
  @Test
    public void clickOnChoosenCinema()
  {
      driver.findElement(By.xpath("//a[@href='/cinema/kyiv/tsum#schedule']")).click();
  }
  @Test
    public void aboutCompany()
  {
 driver.findElement(By.xpath("//a [@href='/ru/about']")).click();
  }
  @Test
    public void listAdministrationCompany()
  {
      driver.findElement(By.xpath("//a [@href='/ru/board']")).click();
  }
  @Test
    public void nameOfAdministrationClick()
  {
      driver.findElement(By.xpath("//p[contains(text(),'Бахматов Максим')]")).click();
  }
  @Test
    public void nextClickName()
  {
      driver.findElement(By.xpath("//a[@class='board-member-info-next']")).click();
  }
  @Test
    public void buyToPopkornClick()
  {
      driver.findElement(By.xpath("//a[contains(text(),'Купить попкорн онлайн')]")).click();
  }
  @Test
    public void plusProduct()
  {
      driver.findElement(By.xpath("//div[@class='btn-plus']")).click();
  }
  @Test
    public void continueBuyProduct()
  {
      driver.findElement(By.xpath("//button[@id='btn-next']")).click();
  }
  @Test
    public void choosePayType()
  {
      driver.findElement(By.xpath("//label[@data-payment-type='privatepay']")).click();
  }
  @Test
    public WebElement writeUserName()
  {
      return driver.findElement(By.xpath("//input[@id='ci_user_name']"));
  }
  @Test
    public WebElement writeNumberUse()
  {
      return driver.findElement(By.xpath("//input[@id='ci_user_phone']"));
  }
  @Test
    public WebElement writeEmailUser()
  {
      return driver.findElement(By.xpath("//input[@id='ci_user_email']"));
  }
  @Test
    public void acceptRulesClick()
  {
      driver.findElement(By.xpath("//div[@class='checkbox-text']")).click();
  }
}
