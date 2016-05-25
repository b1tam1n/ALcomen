package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by EGOR on 24.05.2016.
 */
public class Alcogolik extends AbstractPage {

    public Alcogolik(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver,this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }
    public void Rbatton(String text)
    {
        driver.findElement(By.id(text)).click();
    }


    public void clickBut (String text)
    {
        driver.findElement(By.name(text)).click();

    }
    public boolean Rezult(String text)
    {
        boolean isTake=false;
        if(driver.findElement(By.id(text)).isDisplayed()) isTake=true;

        return isTake;
    }



}
