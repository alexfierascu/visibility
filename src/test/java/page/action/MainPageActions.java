package page.action;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.object.MainPage;

import static setup.DriverSetup.*;

public class MainPageActions extends MainPage {

    public static void accesarePaginaPromotii() {
        getButonPromotii().click();
    }

    public static void navigateToWebsite() {
        getDriver().navigate().to(getURLWebsiteUnderTest());

    }

    public static void navigateToAccesCont() {
        getButonUser().click();
        getDriver().findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[1]/div/div[1]/div/a[1]")).click();
    }


    public static void navigateToInregistrarePage() {
        getButonUser().click();
        getDriver().findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[1]/div/div[1]/div/a[2]")).click();
    }

    public static void acceptCookiesIfPosible() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        try {
            wait.until(ExpectedConditions.visibilityOf(getButonAcceptCookies()));
            getButonAcceptCookies().click();
        }
        catch (Exception e) {
            System.out.println("Butonul de cookies nu este prezent!");
            System.out.println("Deschide un bug, testerule!!!!");
        }

    }

}
