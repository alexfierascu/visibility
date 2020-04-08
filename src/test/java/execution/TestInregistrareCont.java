package execution;

import org.testng.annotations.Test;
import setup.DriverSetup;

import static page.action.InregistrareContActions.fillRegistryDataForNewUser;
import static page.action.MainPageActions.navigateToInregistrarePage;

public class TestInregistrareCont extends DriverSetup {

    @Test
    public void checkThatANewUserCanRegister() throws InterruptedException {
        navigateToInregistrarePage();
        fillRegistryDataForNewUser("test@yahoo.com","parolaSmechera",
                "Prastie Noua", "Ias","str cucilor","0766898989");
    }
}
