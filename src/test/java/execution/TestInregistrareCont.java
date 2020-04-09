package execution;

import org.testng.Assert;
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
        fillRegistryDataForNewUser("Prastie Noua",
                "Iasi", "strada cucilor","0766898989","parolaSmechera");
        checkTermsAndConditionsCheckbox(getButonAcceptareTermeniSiConditii());
        completeRegistrationAfterNewUserDataEntry();
        Assert.assertEquals(getDriver().getTitle(),"dEpurtat - Contul meu");
    }

    @Test
    public void checkThatAnUnregisteredUserCanMakeAQuickOrder() throws InterruptedException {
        System.out.println("1");
        navigateToInregistrarePage();
        System.out.println("2");
        makeAQuickOrder();
        System.out.println("3");
        Assert.assertEquals(getDriver().getTitle(),"dEpurtat - Trimite comanda");
        System.out.println("4");
        fillRegistryDataForNewQuickOrder("Stefan cel mare","Iasi","Strada Palat","0776777101");
        checkTermsAndConditionsCheckbox(getButonAcceptareTermeniSiConditii());
        Assert.assertEquals(getDriver().getTitle(),"Cos de cumparaturi");
    }
}
