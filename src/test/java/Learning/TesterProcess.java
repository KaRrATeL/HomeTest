package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
        headerViev.sendSeacher();
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
        driver.get("https://zakaz.atbmarket.com/");
        driver.findElement(By.xpath("//a[@class='sticky-header__category-link'][@href='/catalog/1154/325']")).click();
        driver.findElement(By.xpath("//a[@href='/product/1154/170651'][@class='catalog-item__photo-link']")).click();
    }
    @Test
    public void zadania1()
    {
        HeaderViev headerViev = new HeaderViev(driver);
        openAtb();
        headerViev.partChooseDeliveryCity();
        sleep(3);
        headerViev.partChooseDeliveryAdress();
        sleep(3);
        headerViev.partChooseCategoryMeatAndEggs();
    }
    @Test
    public void zadania2()
    {
        HeaderViev headerViev = new HeaderViev(driver);
        openAtb();
        headerViev.partChooseDeliveryCityZadanie2();
        sleep(3);
        headerViev.partChooseDeliveryAdressZadaniza2();
        sleep(2);
        headerViev.partCategoryProductZanadia2();
    }
    @Test
    public void zadania3()
    {
        HeaderViev headerViev = new HeaderViev(driver);
        openAtb();
        headerViev.zadan3OpenCatalog();
        sleep(1);
        headerViev.zadan3ChooseCatalogProduct();
        headerViev.zadan3ChooseSomeProduct();
    }
    @Test
    public void zadania4()
    {
        HeaderViev headerViev = new HeaderViev(driver);
        openAtb();
        headerViev.zadan4ChooseCategoria();
        headerViev.zadan4OpenFilters();
        sleep(5);
        headerViev.zadan4ChooseFilters();
        headerViev.zadan4AcceptFilters();
        headerViev.zadan4ChooseProduct();
    }
@Test
    public void zadania5()
{
    Kinoteatr kinoteatr = new Kinoteatr(driver);
    kinoteatr.openKino();
   kinoteatr.clickAcceptRegion();
   kinoteatr.clickToMenu();
   sleep(1);
   kinoteatr.clickSoonFilms();
   kinoteatr.clickOnChooseFilm();
   kinoteatr.watchTrailerFilm();

}
@Test
    public void zadanie6()
{
    Kinoteatr kinoteatr = new Kinoteatr(driver);
    kinoteatr.openKino();
    kinoteatr.clickAcceptRegion();
    kinoteatr.clickToMenu();
    sleep(1);
    kinoteatr.clickChooseCinema();
    kinoteatr.chooseCityCinema();
    sleep(1);
    kinoteatr.transportationToListCinemaOfChooseCity();
    sleep(1);
    kinoteatr.clickOnChoosenCinema();
}
@Test
    public void zadanie7()
{
    Kinoteatr kinoteatr = new Kinoteatr(driver);
    kinoteatr.openKino();
    kinoteatr.clickAcceptRegion();
    kinoteatr.clickToMenu();
    sleep(1);
    kinoteatr.aboutCompany();
    kinoteatr.listAdministrationCompany();
    kinoteatr.nameOfAdministrationClick();
    sleep(2);
    kinoteatr.nextClickName();
    sleep(2);
    kinoteatr.nextClickName();
}
@Test
    public void zadanie8()
{
    Kinoteatr kinoteatr = new Kinoteatr(driver);
    kinoteatr.openKino();
    kinoteatr.clickAcceptRegion();
    kinoteatr.clickToMenu();
    sleep(1);
    kinoteatr.buyToPopkornClick();
    kinoteatr.plusProduct();
    kinoteatr.continueBuyProduct();
    sleep(2);
    kinoteatr.choosePayType();
    kinoteatr.continueBuyProduct();
    sleep(2);
    kinoteatr.writeUserName().click();
    kinoteatr.writeUserName().sendKeys("Гага");
    kinoteatr.writeNumberUse().click();
    kinoteatr.writeNumberUse().sendKeys("380635688812");
    kinoteatr.writeEmailUser().click();
    kinoteatr.writeEmailUser().sendKeys("iloveukraine2354@gmail.com");
    kinoteatr.acceptRulesClick();
    kinoteatr.continueBuyProduct();
}
}
