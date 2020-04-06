package page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static setup.DriverSetup.getDriver;


public class AccesContPage {

    private static final String tiluPaginaAccesCont= "Acces cont - dEpurtat";

    private static WebElement inputEmailAddress = getDriver().findElement(By.id("profile_email"));
    private static WebElement inputPassword = getDriver().findElement(By.id("profile_password"));
    private static WebElement buttonAccessAccount = getDriver().findElement(By.xpath("/html/body/main/div/div/div/div[3]/div/div[1]/form/div[4]/div[2]/button"));
    private static WebElement checkboxRememberMe = getDriver().findElement(By.id("remember_login"));


    public static WebElement getInputEmailAddress() {
        return inputEmailAddress;
    }

    public static void setInputEmailAddress(WebElement inputEmailAddress) {
        AccesContPage.inputEmailAddress = inputEmailAddress;
    }

    public static WebElement getInputPassword() {
        return inputPassword;
    }

    public static void setInputPassword(WebElement inputPassword) {
        AccesContPage.inputPassword = inputPassword;
    }

    public static WebElement getButtonAccessAccount() {
        return buttonAccessAccount;
    }

    public static void setButtonAccessAccount(WebElement buttonAccessAccount) {
        AccesContPage.buttonAccessAccount = buttonAccessAccount;
    }

    public static WebElement getCheckboxRememberMe() {
        return checkboxRememberMe;
    }

    public static void setCheckboxRememberMe(WebElement checkboxRememberMe) {
        AccesContPage.checkboxRememberMe = checkboxRememberMe;
    }

    public static String getTiluPaginaAccesCont() {
        return tiluPaginaAccesCont;
    }

}