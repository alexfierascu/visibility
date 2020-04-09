package execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import setup.DriverSetup;

public class TesteCatalin extends DriverSetup {


    @Test
    public void autentificareClientDePePaginaInregistrare(){
        WebElement butonAutentificare=getDriver().findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[1]/div/div[1]/a/img"));
        butonAutentificare.click();
        WebElement butonAccesarePaginaInregistrare=getDriver().findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[1]/div/div[1]/div/a[2]"));
        butonAccesarePaginaInregistrare.click();
        Assert.assertEquals(getDriver().getTitle(),"dEpurtat - Inregistrare");
        WebElement butonAccesareCont=getDriver().findElement(By.xpath("//*[@id=\"page_signup_form\"]/div/div[2]/p[2]/a"));
        butonAccesareCont.click();
        Assert.assertEquals(getDriver().getTitle(), "Acces cont - dEpurtat");
    }


    @Test
    public void comandaRapidaFaraInregistrareSiAutentificare(){
        WebElement butonAutentificare=getDriver().findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[1]/div/div[1]/a/img"));
        butonAutentificare.click();
        WebElement butonAccesarePaginaInregistrare=getDriver().findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[1]/div/div[1]/div/a[2]"));
        butonAccesarePaginaInregistrare.click();
        Assert.assertEquals(getDriver().getTitle(),"dEpurtat - Inregistrare");

        WebElement butonComandaRapida=getDriver().findElement(By.xpath("//*[@id=\"page_signup_form\"]/div/div[2]/p[4]/a"));
        butonComandaRapida.click();

        WebElement inputEmail=getDriver().findElement(By.id("profile_email"));
        WebElement inputNumeSiPrenume=getDriver().findElement(By.id("profile_billing_person_name"));
        WebElement inputOras=getDriver().findElement(By.id("profile_billing_city"));

        WebElement inputAdresa=getDriver().findElement(By.id("profile_billing_address"));
        WebElement inputNumarTelefon=getDriver().findElement(By.id("profile_billing_phone"));

        inputEmail.sendKeys("blabla@yahoo.ro");
        inputNumeSiPrenume.sendKeys("bla junior");
        inputOras.sendKeys("Iasi");
        inputAdresa.sendKeys("zona viselor");
        inputNumarTelefon.sendKeys("0744998899");
        WebElement butonAcceptareConditii=getDriver().findElement(By.id("confirm_terms_desktop"));
//       for (int i=0;i<2;i++){
//           butonAcceptareConditii.click();
//           System.out.println(butonAcceptareConditii.isSelected());
//       }

        Assert.assertFalse(butonAcceptareConditii.isSelected());

        WebElement butonComanda=getDriver().findElement(By.xpath("/html/body/main/div/div/div/form/div/div[1]/div[10]/button"));
        butonComanda.click();
    }
}
