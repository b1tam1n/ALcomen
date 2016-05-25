package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by EGOR on 25.05.2016.
 */
public class Enter extends AbstractPage {

    public Enter(WebDriver driver){
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
        driver.findElement(By.name(text)).click();

    }
    public void Tfield(String elementid, String visibletext)
    {

        driver.findElement(By.name(elementid)).sendKeys(visibletext);

    }

    public void Rbatton(String text)
    {
        driver.findElement(By.id(text)).click();
    }

    public boolean Rezult(String text)
    {
        boolean isTake=false;
        if(driver.findElement(By.id(text)).isDisplayed()) isTake=true;

        return isTake;
    }








}
