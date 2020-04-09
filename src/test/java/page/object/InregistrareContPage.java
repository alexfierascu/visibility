package page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static setup.DriverSetup.getDriver;

public class InregistrareContPage {


    private static String titluPaginaInregistrare = "dEpurtat - Inregistrare";
    private static WebElement inputEmail = getDriver().findElement(By.id("profile_email"));
    private static WebElement inputPassword = getDriver().findElement(By.id("profile_password"));
    private static WebElement inputNumeSiPrenume = getDriver().findElement(By.id("profile_billing_person_name"));
    private static WebElement inputOras = getDriver().findElement(By.id("profile_billing_city"));
    private static WebElement inputAdresa = getDriver().findElement(By.id("profile_billing_address"));
    private static WebElement inputNumarTelefon = getDriver().findElement(By.id("profile_billing_phone"));
    private static WebElement butonAcceptareTermeniSiConditii = getDriver().findElement(By.id("confirm_terms_desktop"));
    private static WebElement butonInregistrare = getDriver().findElement(By.xpath("//*[@id=\"user_account_fields\"]/div[10]/button"));

    private static WebElement butonQuickOrder=getDriver().findElement(By.xpath("//*[@id=\"page_signup_form\"]/div/div[2]/p[4]/a"));

    public static WebElement getButonQuickOrder() {
        return butonQuickOrder;
    }

    public static void setButonQuickOrder(WebElement butonQuickOrder) {
        InregistrareContPage.butonQuickOrder = butonQuickOrder;
    }

    public static WebElement getButonInregistrare() {
        return butonInregistrare;
    }

    public static void setButonInregistrare(WebElement butonInregistrare) {
        InregistrareContPage.butonInregistrare = butonInregistrare;
    }

    public static WebElement getButonAcceptareTermeniSiConditii() {
        return butonAcceptareTermeniSiConditii;
    }

    public static void setButonAcceptareTermeniSiConditii(WebElement butonAcceptareTermeniSiConditii) {
        InregistrareContPage.butonAcceptareTermeniSiConditii = butonAcceptareTermeniSiConditii;
    }

    public static String getTitluPaginaInregistrare() {
        return titluPaginaInregistrare;
    }

    public static void setTitluPaginaInregistrare(String titluPaginaInregistrare) {
        InregistrareContPage.titluPaginaInregistrare = titluPaginaInregistrare;
    }

    public static WebElement getInputEmail() {
        return inputEmail;
    }

    public static void setInputEmail(WebElement inputEmail) {
        InregistrareContPage.inputEmail = inputEmail;
    }

    public static WebElement getInputPassword() {
        return inputPassword;
    }

    public static void setInputPassword(WebElement inputPassword) {
        InregistrareContPage.inputPassword = inputPassword;
    }

    public static WebElement getInputNumeSiPrenume() {
        return inputNumeSiPrenume;
    }

    public static void setInputNumeSiPrenume(WebElement inputNumeSiPrenume) {
        InregistrareContPage.inputNumeSiPrenume = inputNumeSiPrenume;
    }

    public static WebElement getInputOras() {
        return inputOras;
    }

    public static void setInputOras(WebElement inputOras) {
        InregistrareContPage.inputOras = inputOras;
    }

    public static WebElement getInputAdresa() {
        return inputAdresa;
    }

    public static void setInputAdresa(WebElement inputAdresa) {
        InregistrareContPage.inputAdresa = inputAdresa;
    }

    public static WebElement getInputNumarTelefon() {
        return inputNumarTelefon;
    }

    public static void setInputNumarTelefon(WebElement inputNumarTelefon) {
        InregistrareContPage.inputNumarTelefon = inputNumarTelefon;
    }
}
