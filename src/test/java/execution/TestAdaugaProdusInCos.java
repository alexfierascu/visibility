package execution;

import org.testng.annotations.Test;
import setup.DriverSetup;

import static page.action.MainPageActions.accesarePaginaPromotii;
import static page.action.PromotionsPageActions.checkDetailsForFistProductInPromotionsPage;

public class TestAdaugaProdusInCos extends DriverSetup {

    @Test
    public void checkThatUnregisteredUserCanAddAPromotionProductToCart() {

        getDriver().get("https://www.depurtat.ro/");
        accesarePaginaPromotii();
        checkDetailsForFistProductInPromotionsPage();
    }

}
