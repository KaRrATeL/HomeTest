package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HeaderViev extends BasePage{

    public HeaderViev(WebDriver driver){

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
    private static final String PAGENOVUS = "//a [@href='https://novus.zakaz.ua/uk/']";
    private static final String SEARCHER = "//input [@placeholder='Пошук у NOVUS']";
    private static final String ENTERSEARCH = "//input [@type='search']";
    private static final String EXAMINATION = "//button [@data-marker='Yes']";
    private static final String CLICKBUTTON= "//img [@src='https://img2.zakaz.ua/src.1620745138.ad72436478c_2021-05-11_Victor/src.1620745138.SNCPSG10.obj.0.1.jpg.oe.jpg.pf.jpg.150nowm.jpg.150x.jpg']";
    private static final String CLICTOADD= "//button [@data-marker='Add to cart'][@class='jsx-44091497 btn btn-default AddButton AddButton_fullWidth']";
    private static final String NOVAPOSHTA= "//li [@data-marker='Nova Poshta']";
    //For Zadania1
    private static final String CHOOSEDELIVERY = "//button[contains(text(), 'Оберіть спосіб доставки')]";
    private static final String SELECTREGION = "//select[@name='region']";
    private static final String CHOOSEAREA = "//option[@value='31']";
    private static final String SELECTCITY= "//select[@id='city']";
    private static final String CHOOSECITY = "//option[@value='395']";
    private static final String SELECTTAKEPUNCTION= "//span[contains(text(),'Самовивіз із магазину')]";
    private static final String ACCEPTDELIVERYADRESS= "//button[@class='js-btn-continue custom-blue-btn city-modal__continue-btn']";
    private static final String CLICKARROWCHOOSE = "//span[@class='select2-selection__arrow']";
    private static final String FINDADRESS= "//input[@aria-autocomplete='list']";
    private static final String CATEGORYSELECT = "//a[@href='/catalog/1108/343'][@class='sticky-header__cate link']";
    private static final String CATEGORYSELECTPRODUCT= "//a[contains(text(),' Яйце куряче 10 шт Україна 1 ка ія фас ')]";
    private static final String CATEGORYADDPRODUCT= "//button[@class='b-addToCart__basket-btn'][@type='butto aria-label='Добавить товар']";
    //For Zadanie 2
    private static final String AREACHOOSE = "//option[@value='67']";
    private static final String CITYCHOOSE = "//option[@value='689']";

    private static final String MAPCHOOSE = "//span[@class='select2-selection select2-selection--single']";
    private static final String SELECTCATEGORY= "//a[@href='/catalog/1299/287'][@class='sticky-header__category-link']";
   private static final String CHOOSEPRODUCT = "//img[@alt='Авокадо вагове 1 гат']";
   //FOR ZADANIA3----------------------------------------------------------------------------------------------------------------------
    private static final String Z3CHOOSECATEGORY ="//span[@class='catalog-button__text']" ;
    private static final String Z3CHOOSETIMESINCATEGORY = "//a[contains(text(), 'Риба і морепродукти')]";
    private static final String Z3CHOOSEPRODUCT= "//a[@href='/product/1154/149890'][@class='catalog-item__photo-link']";
    //FOR ZADANIA4======================================================================================================================
    private static final String Z4CHOOSECORECTCATEGORY = "//a[@href='/catalog/1154/285'][@class='sticky-header__category-link']";
    private static final String Z4OPENFILTER = "//button[@class='catalog-page__filter-btn']";
    private static final String Z4CHOOSEFILTER= "//div[@aria-label='Мрія']";
    private static final String Z4ACCEPTFILTER="//button[@class='catalog-filter__submit custom-blue-btn']" ;
    private static final String Z4CHOOSEPRODUCTE= "//a[@href='/product/1154/79531'][@class='blue-link']";
public void clickOnNovus() {

    driver.findElement(By.xpath(PAGENOVUS)).click();
}
public void searchNovus(){

    driver.findElement(By.xpath(SEARCHER)).click();
}
public void sendSeacher(){
   driver.findElement(By.xpath(ENTERSEARCH)).sendKeys("Алкоголь \n");
}
public void examinationYears(){
    driver.findElement(By.xpath(EXAMINATION)).click();
}
public void pushOnButton()
{
    driver.findElement(By.xpath(CLICKBUTTON)).click();
}
public void addToCart(){
    driver.findElement(By.xpath(CLICTOADD)).click();
}
public void addToNovaPoshta (){
    driver.findElement(By.xpath(NOVAPOSHTA)).click();
}
//For Zadania1----------------------------------------------------------------------------
public void partChooseDeliveryCity()
{
    driver.findElement(By.xpath(CHOOSEDELIVERY)).click();
    driver.findElement(By.xpath(SELECTREGION)).click();
    driver.findElement(By.xpath(CHOOSEAREA)).click();
    driver.findElement(By.xpath(SELECTCITY)).click();
    driver.findElement(By.xpath(CHOOSECITY)).click();
    driver.findElement(By.xpath(SELECTTAKEPUNCTION)).click();
    driver.findElement(By.xpath(ACCEPTDELIVERYADRESS)).click();
}
public void partChooseDeliveryAdress()
{
    driver.findElement(By.xpath(CLICKARROWCHOOSE)).click();
    driver.findElement(By.xpath(FINDADRESS)).click();
    driver.findElement(By.xpath(FINDADRESS)).sendKeys("бул. Праці, 6/14\n");
}
public void partChooseCategoryMeatAndEggs(){
    driver.findElement(By.xpath(CATEGORYSELECT)).click();
    driver.findElement(By.xpath(CATEGORYSELECTPRODUCT)).click();
    driver.findElement(By.xpath(CATEGORYADDPRODUCT)).click();
}
    //For Zadanie2
public void partChooseDeliveryCityZadanie2()
{
    driver.findElement(By.xpath(CHOOSEDELIVERY)).click();
    driver.findElement(By.xpath(SELECTREGION)).click();
    driver.findElement(By.xpath(AREACHOOSE)).click();
    driver.findElement(By.xpath(SELECTCITY)).click();
    driver.findElement(By.xpath(CITYCHOOSE)).click();
    driver.findElement(By.xpath(SELECTTAKEPUNCTION)).click();
    driver.findElement(By.xpath(ACCEPTDELIVERYADRESS)).click();

}
public void partChooseDeliveryAdressZadaniza2()
{
driver.findElement(By.xpath(MAPCHOOSE)).click();
driver.findElement(By.xpath(FINDADRESS)).click();
    driver.findElement(By.xpath(FINDADRESS)).sendKeys("вул. Паустовського, 19\n");

}
public void partCategoryProductZanadia2()
{
    driver.findElement(By.xpath(SELECTCATEGORY)).click();
    driver.findElement(By.xpath(CHOOSEPRODUCT)).click();
    driver.findElement(By.xpath(CATEGORYADDPRODUCT)).click();

}
//FOR Zadania3-----------------------------------------------------------------------------------------------------'
    public void zadan3OpenCatalog()
    {
        driver.findElement(By.xpath(Z3CHOOSECATEGORY)).click();
    }
    public void zadan3ChooseCatalogProduct()
    {
        driver.findElement(By.xpath(Z3CHOOSETIMESINCATEGORY)).click();
    }
    public void zadan3ChooseSomeProduct()
    {
        driver.findElement(By.xpath(Z3CHOOSEPRODUCT)).click();
    }
    //FOR ZADANIA4====================================================================================================
    public void zadan4ChooseCategoria()
    {
        driver.findElement(By.xpath(Z4CHOOSECORECTCATEGORY)).click();

    }
public void zadan4OpenFilters()
{
    driver.findElement(By.xpath(Z4OPENFILTER)).click();
}
public void zadan4ChooseFilters()
{
    driver.findElement(By.xpath(Z4CHOOSEFILTER)).click();
}
public void zadan4AcceptFilters()
{
    driver.findElement(By.xpath(Z4ACCEPTFILTER)).click();
}
public void zadan4ChooseProduct()
{
    driver.findElement(By.xpath(Z4CHOOSEPRODUCTE)).click();
}
}
