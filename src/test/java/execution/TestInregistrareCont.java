package execution;

import org.testng.annotations.Test;
import setup.DriverSetup;

import static page.action.InregistrareContActions.checkTermsAndConditionsCheckbox;
import static page.action.MainPageActions.navigateToInregistrarePage;
import static page.object.InregistrareContPage.getButonAcceptareTermeniSiConditii;

public class TestInregistrareCont extends DriverSetup {

    @Test
    public void checkThatANewUserCanRegister() throws InterruptedException {
        navigateToInregistrarePage();
        checkTermsAndConditionsCheckbox(getButonAcceptareTermeniSiConditii());
//        fillRegistryDataForNewUser("test@yahoo.com","parolaSmechera",
//                "Prastie Noua", "Ias","str cucilor","0766898989");
    }
}
