package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by EGOR on 24.05.2016.
 */
public class Comment extends AbstractPage {


    public Comment(WebDriver driver){
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
    public void Tfield(String elementid, String visibletext)
    {

        driver.findElement(By.id(elementid)).sendKeys(visibletext);

    }

    public boolean Rezult(String text)
    {
        boolean isTake=false;
        if(driver.findElement(By.className(text)).isDisplayed()) isTake=true;

        return isTake;
    }





}
