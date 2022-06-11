import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderViev extends BasePage{
    public HeaderViev(WebDriver driver){

        super(driver);
    }
    private static final String PAGENOVUS = "//a [@href='https://novus.zakaz.ua/uk/']";
    private static final String SEARCHER = "//input [@placeholder='Пошук у NOVUS']";
    private static final String ENTERSEARCH = "//input [@type='search']";
    private static final String EXAMINATION = "//button [@data-marker='Yes']";
    private static final String CLICKBUTTON= "//img [@src='https://img2.zakaz.ua/src.1620745138.ad72436478c_2021-05-11_Victor/src.1620745138.SNCPSG10.obj.0.1.jpg.oe.jpg.pf.jpg.150nowm.jpg.150x.jpg']";
    private static final String CLICTOADD= "//button [@data-marker='Add to cart'][@class='jsx-44091497 btn btn-default AddButton AddButton_fullWidth']";
    private static final String NOVAPOSHTA= "//li [@data-marker='Nova Poshta']";
public void clickOnNovus() {
    driver.findElement(By.xpath(PAGENOVUS)).click();
}
public void searchNovus(){
    driver.findElement(By.xpath(SEARCHER)).click();
}
public WebElement sendSeacher(){
   //driver.findElement(By.xpath(ENTERSEARCH)).sendKeys("Алкоголь \n");
   return getElementByXpath(ENTERSEARCH);

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
}
