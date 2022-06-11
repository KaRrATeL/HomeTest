import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TesterProcess extends TestInit {


    @Test
    public void rozetka() {
        starteri();
        driver.get("https://rozetka.com.ua/");
        driver.findElement(By.xpath("//button[@id='fat-menu']")).click();
        driver.findElement(By.xpath("//a[contains(text(), 'Зоотовары')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Собаки') and @href='https://rozetka.com.ua/tovary-dlia-sobak/c4626063/']")).click();


    }

    @Test
    public void zakaz() {
        HeaderViev headerViev = new HeaderViev(driver);
        openZakaz();
        headerViev.clickOnNovus();
        headerViev.searchNovus();
        headerViev.sendSeacher().sendKeys("Алкоголь \n");
        //sleep(3);
       headerViev.examinationYears();
        headerViev.pushOnButton();
        headerViev.addToCart();
        sleep(3);
        headerViev.addToNovaPoshta();


    }
    @Test
    public void zakaz2(){
        HeaderViev headerViev = new HeaderViev(driver);
        zakaz2Start();
        sleep(3);
        zakaz2Main1();
        sleep(2);
        zaka2Main2();
        sleep(2);
        zakaz2Main3();
        sleep(1);
        zaka2End();
    }
    @Test
    public void zakaz3(){

        driver.get("https://zakaz.atbmarket.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");


    }
    @Test
    public void zakaz4(){
        driver.get("https://www.tunemymusic.com/ru/#step1");
        driver.findElement(By.xpath("//div[@id='startButton']")).click();
        sleep(1);
        driver.findElement(By.xpath("//div[@class='MusicServiceBlock YouTube']")).click();
        driver.findElement(By.xpath("//input[@id='UrlPicker']")).click();




    }
}
