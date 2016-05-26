import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import Steps.Steps;

public class AutoTests
{
    private Steps steps;
    @BeforeMethod(description = "Init Browser")
    public void setUp()
    {
        steps=new Steps();
        steps.initBrowser();
    }
    @Test(description = " first_Test  SahBrag")
    public void SahBrag()
    {
        Assert.assertTrue(steps.SahBrag());
    }
    @Test(description = " second_Test  Calc_Alc")
    public void CalcAlc()
    {
        Assert.assertTrue(steps.CalcAlc());
    }
    @Test(description = " thrid_Test  DilSpirt")
    public void DilSpirt()
    {
        Assert.assertTrue(steps.DilSpirt());
    }
    @Test(description = " fourth_Test  Tes_Alc")
    public void Test_alc()
    {
        Assert.assertTrue(steps.Test_alc());
    }
    @Test(description = " five_Test  Alcogolik")
    public void Alcogolik()
    {
        Assert.assertTrue(steps.izvAlcogolik());
    }
    @Test(description = " six_Test  Comment")
    public void Comment()
    {
        Assert.assertTrue(steps.Comment());
    }
    @Test(description = " seven_Test  Napitok ")
    public void Nap_alc()
    {
        Assert.assertTrue(steps.Nap_Alc());
    }
       @Test(description = " eight_Test8  NapitokYou ")
    public void NapYou()
    {
        Assert.assertTrue(steps.NapYou());
    }
    @Test(description = " nine_Test  Superman ")
    public void Superman()
    {
        Assert.assertTrue(steps.Superman());
    }
    @Test(description = " ten_Test Enter ")
    public void Enter ()
    {
        Assert.assertTrue(steps.Enter());
    }
    @AfterMethod(description = "Close browser")
    public void closeBrowser() {
        steps.CloseDriver();
    }
}
