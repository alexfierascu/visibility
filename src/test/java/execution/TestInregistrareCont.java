package execution;

import org.testng.annotations.Test;
import setup.DriverSetup;

import static page.action.InregistrareContActions.*;
import static page.action.MainPageActions.navigateToInregistrarePage;
import static page.object.InregistrareContPage.getButonAcceptareTermeniSiConditii;

public class TestInregistrareCont extends DriverSetup {

    //flaky test
    //todo - improvements
    @Test
    public void checkThatANewUserCanRegister() throws InterruptedException {
        navigateToInregistrarePage();
        fillRegistryDataForNewUser("test@yahoo.com","parolaSmechera",
                "Prastie Noua", "Iasi","str cucilor","0766898989");
        checkTermsAndConditionsCheckbox(getButonAcceptareTermeniSiConditii());
        completeRegistrationAfterNewUserDataEntry();
    }
}
