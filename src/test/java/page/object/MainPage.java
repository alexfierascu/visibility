package page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static setup.DriverSetup.getDriver;

//page object model design pattern
public class MainPage {


    private static String titluMainPage = "dEpurtat - Cel mai bun raport calitate/pret la incaltaminte de dama";
    private static WebElement butonPromotii = getDriver().findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/nav/ul/li[2]/a"));
    private static WebElement acceptCookiesButton = getDriver().findElement(By.xpath("/html/body/div[1]/div/div[2]/a"));
    private static WebElement butonNoutati = getDriver().findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/nav/ul/li[2]/a"));
//    private static WebElement butonPantofi = getDriver().findElement(By.xpath("valoare"));
//    private static WebElement butonSport = getDriver().findElement(By.xpath("valoare"));

    private static WebElement butonAcceptCookies = getDriver().findElement(By.xpath("//*[@id=\"cookie_policy_links\"]/a"));

    private static WebElement butonUser = getDriver().findElement(By.xpath("/html/body/header/div[1]/div[1]/div/div[1]/a/img"));

    private static WebElement butonAccesareCont = getDriver().findElement(By.xpath("/html/body/header/div[1]/div[1]/div/div[1]/div/a[1]"));


    /*
    page factory model example
    @FindBy(id="id_button2")
    private static WebElement butonLogin;
    */

    public static WebElement getButonAcceptCookies() {
        return butonAcceptCookies;
    }

    public static void setButonAcceptCookies(WebElement butonAcceptCookies) {
        MainPage.butonAcceptCookies = butonAcceptCookies;
    }

    public static WebElement getButonPromotii() {
        return butonPromotii;
    }

    public static void setButonPromotii(WebElement butonPromotii) {
        MainPage.butonPromotii = butonPromotii;
    }

    public String getTitluMainPage() {
        return titluMainPage;
    }

    public void setTitluMainPage(String titluMainPage) {
        this.titluMainPage = titluMainPage;
    }

    public WebElement getAcceptCookiesButton() {
        return acceptCookiesButton;
    }

    public void setAcceptCookiesButton(WebElement acceptCookiesButton) {
        this.acceptCookiesButton = acceptCookiesButton;
    }

    public WebElement getButonNoutati() {
        return butonNoutati;
    }

    public void setButonNoutati(WebElement butonNoutati) {
        this.butonNoutati = butonNoutati;
    }

//    public WebElement getButonPantofi() {
//        return butonPantofi;
//    }
//
//    public void setButonPantofi(WebElement butonPantofi) {
//        this.butonPantofi = butonPantofi;
//    }
//
//    public WebElement getButonSport() {
//        return butonSport;
//    }
//
//    public void setButonSport(WebElement butonSport) {
//        this.butonSport = butonSport;
//    }

    public static WebElement getButonUser() {
        return butonUser;
    }

    public void setButonUser(WebElement butonUser) {
        this.butonUser = butonUser;
    }

    public WebElement getButonAccesareCont() {
        return butonAccesareCont;
    }

    public void setButonAccesareCont(WebElement butonAccesareCont) {
        this.butonAccesareCont = butonAccesareCont;
    }
}
