package execution;

import org.testng.annotations.Test;
import setup.DriverSetup;

import static page.action.MainPageActions.accesarePaginaPromotii;
import static page.action.PromotionsPageActions.checkDetailsForFistProductInPromotionsPage;

public class TestAccesCont extends DriverSetup {
    @Test
    public void paginaAccesCont(){
       getDriver().get("https://www.depurtat.ro/login");


    }
}
