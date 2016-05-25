package Steps;
import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class Steps {
    private WebDriver driver;
    public void initBrowser()
    {
        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
    }
    public boolean SahBrag()
    {
        SahBrag sahbrag = new SahBrag(driver);
        sahbrag.openPage("http://alcofan.com/raschet-parametrov-samogonovareniya");
        sahbrag.Tfield("sugar","12");
        sahbrag.Tfield("water","3");
        sahbrag.clickBut("sub_kalorii");
        return sahbrag.TakeRezult("Suslo_Result");
    }
    public boolean CalcAlc()
    {
        CalcAlc calcAlc = new CalcAlc(driver);
        calcAlc.openPage("http://alcofan.com/kalkulyator-alkogolya");
        calcAlc.Rbatton("gender");
        calcAlc.Tfield("weight","82");
        calcAlc.Tfield("height","190");
        calcAlc.Tfield("drink1","16");
        calcAlc.Tfield("amount1","1500");
        calcAlc.Tfield("drink2","40");
        calcAlc.Tfield("amount2","300");
        calcAlc.Tfield("drink3","2");
        calcAlc.Tfield("amount3","100");
        calcAlc.Rbatton("gstr");
        calcAlc.clickBut("alc");
         return calcAlc.Rezult("drink_Result");
    }

    public boolean NapYou()
    {
        NapYou napYou = new NapYou(driver);
        napYou.openPage(" http://alcofan.com/test-podbor-alkogolnogo-koktejlya");
        napYou.Rbatton("answer_id_234");
        napYou.Rbatton("answer_id_238");
        napYou.Rbatton("answer_id_242");
        napYou.Rbatton("answer_id_246");
        napYou.Rbatton("answer_id_251");
        napYou.Rbatton("answer_id_253");
        napYou.Rbatton("answer_id_259");
        napYou.Rbatton("answer_id_260");
        napYou.Rbatton("answer_id_266");
        napYou.Rbatton("answer_id_269");
        napYou.clickBut("action");

        return napYou.Rezult("testme_result");

    }
    public boolean Superman()
    {
        Superman superman = new Superman(driver);
        superman.openPage("http://alcofan.com/alkogolnyj-supergeroj");
        superman.Rbatton("answer_id_272");
        superman.Rbatton("answer_id_279");
        superman.Rbatton("answer_id_292");
        superman.Rbatton("answer_id_296");
        superman.Rbatton("answer_id_305");
        superman.Rbatton("answer_id_309");
        superman.Rbatton("answer_id_316");
        superman.Rbatton("answer_id_323");
        superman.Rbatton("answer_id_334");
        superman.clickBut("action");
        return  superman.Rezult("testme_result");
    }

    public boolean DilSpirt()
    {
        DilSpirt dilSpirt = new DilSpirt(driver);
        dilSpirt.openPage("http://alcofan.com/raschet-parametrov-samogonovareniya");
        dilSpirt.Tfield("volume1","10");
        dilSpirt.Tfield("alc_capacity1","80");
        dilSpirt.Tfield("alc_capacity_recieved1","30");
        dilSpirt.clickBut("spirt");
        return dilSpirt.Rezult("Vodka_Result");
    }
    public boolean Test_alc()
    {
        Test_alc test_alc = new Test_alc(driver);
        test_alc.openPage("http://alcofan.com/test-na-alkogolizm");
        test_alc.Rbatton("answer_id_1");
        test_alc.Rbatton("answer_id_7");
        test_alc.Rbatton("answer_id_8");
        test_alc.Rbatton("answer_id_37");
        test_alc.Rbatton("answer_id_14");
        test_alc.Rbatton("answer_id_17");
        test_alc.Rbatton("answer_id_18");
        test_alc.Rbatton("answer_id_23");
        test_alc.Rbatton("answer_id_26");
        test_alc.Rbatton("answer_id_29");
        test_alc.Rbatton("answer_id_33");
        test_alc.Rbatton("answer_id_35");
        test_alc.clickBut("action");
        return test_alc.Rezult("testme_result");
    }
    public boolean Enter()
    {
        Enter enter = new Enter(driver);
        enter.openPage("http://forum.alcofan.com/ucp.php?mode=login");
        enter.Tfield("username","egor1995");
        enter.Tfield("password","asdf19372486");
        enter.clickBut("login");
        return  enter.Rezult("username_logged_in");
    }
    public boolean izvAlcogolik()
    {
        Alcogolik alc = new Alcogolik(driver);
        alc.openPage("http://alcofan.com/test-izvestnye-alkogoliki/comment-page-1#comment-58268");
        alc.Rbatton("answer_id_342");
        alc.Rbatton("answer_id_346");
        alc.Rbatton("answer_id_352");
        alc.Rbatton("answer_id_363");
        alc.Rbatton("answer_id_369");
        alc.Rbatton("answer_id_375");
        alc.Rbatton("answer_id_380");
        alc.clickBut("action");
        return alc.Rezult("testme_result");
    }
    public boolean Comment()
    {
        Comment com = new Comment(driver);
        com.openPage("http://alcofan.com/test-izvestnye-alkogoliki/comment-page-1#comment-58268");
        com.Tfield("author","optimis_t@mail.ru");
        com.Tfield("comment","Пить это весело");
        com.Tfield("email","optimis_t@mail.ru");
        com.Rbatton("submit");
        return com.Rezult("comment-metadata");
    }
    public boolean Nap_Alc()
    {
        Napitoc_alk nap_alc=new Napitoc_alk(driver);
        nap_alc.openPage("http://alcofan.com/na-kakoj-alkogolnyj-napitok-vy-poxozhi");
        nap_alc.Rbatton("answer_id_192");
        nap_alc.Rbatton("answer_id_199");
        nap_alc.Rbatton("answer_id_201");
        nap_alc.Rbatton("answer_id_205");
        nap_alc.Rbatton("answer_id_210");
        nap_alc.Rbatton("answer_id_213");
        nap_alc.Rbatton("answer_id_219");
        nap_alc.clickBut("action");
        return  nap_alc.Rezult("testme_result");
    }


}
