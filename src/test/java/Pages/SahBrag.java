package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


/**
 * Created by EGOR on 22.05.2016.
 */
public class SahBrag extends AbstractPage {

    public SahBrag(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver,this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void clickBut (String text)
    {
        driver.findElement(By.cssSelector("#suslo_calc > div.to-the-center > input[type=\"submit\"]")).click();

    }
    public void Tfield(String elementid, String visibletext)
    {

        driver.findElement(By.name(elementid)).sendKeys(visibletext);

    }

    public void enter(String elementid, String visibletext)
    {

        driver.findElement(By.name(elementid)).sendKeys(visibletext);

    }

    public boolean TakeRezult(String text)
    {
        boolean isTake=false;
        if(driver.findElement(By.id(text)).isDisplayed()) isTake=true;

        return isTake;
    }


}
