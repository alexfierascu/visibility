package page.action;

import model.NewUser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import page.object.InregistrareContPage;

import static setup.DriverSetup.getDriver;

public class InregistrareContActions extends InregistrareContPage {

    public static void fillRegistryDataForNewUser(String email, String numePrenume,
                                                  String oras, String adresa,
                                                  String telefon, String parola) throws InterruptedException {
        getInputEmail().sendKeys(email);
        getInputNumeSiPrenume().sendKeys(numePrenume);
        //Poti pune fallback/workaround daca vrei doar sa arati ca merge, nu si codul
        //Daca nu apare dropdown-ul sa incerci de X ori
        getInputOras().clear();
        getInputOras().sendKeys(oras);
        Thread.sleep(2000);
        WebElement fistCityChoice = getDriver().findElement(By.xpath("//div[contains(@class, 'autocomplete-suggestions')]/span[@data-val]"));
        fistCityChoice.click();
        getInputAdresa().sendKeys(adresa);
        getInputNumarTelefon().sendKeys(telefon);
        getInputPassword().sendKeys(parola);
    }

    //for TDD  - test driven development
    // newUser is test data extracted from an excel file
    public static void fillRegistryDataForNewUser(NewUser newUser) throws InterruptedException {
        getInputEmail().sendKeys(newUser.getEmail());
        getInputNumeSiPrenume().sendKeys(newUser.getNumePrenume());
        //Poti pune fallback/workaround daca vrei doar sa arati ca merge, nu si codul
        //Daca nu apare dropdown-ul sa incerci de X ori
        getInputOras().clear();
        getInputOras().sendKeys(newUser.getOras());
        Thread.sleep(2000);
        WebElement fistCityChoice = getDriver().findElement(By.xpath("//div[contains(@class, 'autocomplete-suggestions')]/span[@data-val]"));
        fistCityChoice.click();
        getInputAdresa().sendKeys(newUser.getAdresa());
        getInputNumarTelefon().sendKeys(newUser.getTelefon());
        getInputPassword().sendKeys(newUser.getParola());
    }

    public static void checkTermsAndConditionsCheckbox(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", element);
    }

    public static void completeRegistrationAfterNewUserDataEntry() {
        getButonInregistrare().click();
    }
}
