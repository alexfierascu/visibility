package page.action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import page.object.InregistrareContPage;

import java.util.List;

import static setup.DriverSetup.getDriver;

public class InregistrareContActions extends InregistrareContPage {

    public static void checkTermsAndConditionsCheckbox(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", element);

    }

    public static void fillRegistryDataForNewUser(String email, String parola,
                                                  String numePrenume, String oras,
                                                  String adresa, String telefon) throws InterruptedException {

        String textToSelect = "Iasi";
        getInputEmail().sendKeys(email);
        getInputNumeSiPrenume().sendKeys(numePrenume);
        getInputAdresa().sendKeys(adresa);
        getInputNumarTelefon().sendKeys(telefon);
        getInputPassword().sendKeys(parola);

        getInputOras().clear();
        getInputOras().sendKeys(oras);
        List<WebElement> optionsToSelect = getDriver().findElements(By.xpath("//*[@id=\"user_account_fields\"]/div[6]/div/div[2]/div"));


        for (WebElement option : optionsToSelect) {
            System.out.println(option);
//            if (option.getText().equals(textToSelect)) {
//                System.out.println("Trying to select: " + textToSelect);
//                option.click();
//                break;
//            }
        }

//        // Create object on Actions class
//        Actions builder = new Actions(getDriver());
//        Thread.sleep(4000);
//        // find the element which we want to Select from auto suggestion
//        WebElement ele = getDriver().findElement(By.id("profile_billing_city"));
//        Thread.sleep(4000);
//        // use Mouse hover action for that element
//        builder.moveToElement(ele).build().perform();
//
//        Thread.sleep(4000);
//
//        // finally click on that element
//        builder.click(ele).build().perform();

//        Thread.sleep(4000);
//        getInputOras().sendKeys(oras);
//        Thread.sleep(4000);
        //todo -- alexF

//        getInputOras().
//        Select orasDeSelectat=new Select(getDriver().findElement(By.xpath("//*[@id=\"profile_billing_city\"]")));
//        orasDeSelectat.selectByIndex(0);
    }

    public static void completeRegistrationAfterNewUserDataEntry() {
        getButonInregistrare().click();
    }
}
