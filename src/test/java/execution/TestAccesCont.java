package execution;

import org.testng.Assert;
import org.testng.annotations.Test;
import setup.DriverSetup;

import static page.action.AccesContActions.fillInRegisteredUserAndAccessAccount;
import static page.action.MainPageActions.*;
import static page.object.AccesContPage.getTiluPaginaAccesCont;
import static page.object.MyAccountPage.getTitleMyAccountPage;

public class TestAccesCont extends DriverSetup {


    @Test
    public void acceptCookies() {
        acceptCookiesIfPosible();
        Assert.assertTrue(getButonAcceptCookies().isDisplayed());
    }
    @Test
    public void navigarePaginaAccesCont(){

        System.out.println("navigare catre pagina de acces cont");
        navigateToAccesCont();
        System.out.println("Navigare realizata cu succes");

        System.out.println("verificare titlu pagina");
        Assert.assertEquals(getDriver().getTitle(),getTiluPaginaAccesCont());
        System.out.println("Verificarea a trecut");
    }

    @Test
    public void checkThatImportantElementsAreVisile() {
    //todo - daca vreti
    }


    @Test
    public void loginRegisteredUser() {

        navigateToAccesCont();
        //trimitem user si parola ca variabile de environment -- notiune foarte avansata
        //lucrul asta nu se face din cod, ci din CI&CD pipeline tools (Jenkins)

        //dc? pentru ca lucram cu date sensibile
        fillInRegisteredUserAndAccessAccount("eneredqa@gmail.com","Parola123!@");
        Assert.assertEquals(getDriver().getTitle(),getTitleMyAccountPage());

    }

}
