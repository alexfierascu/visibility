package page.action;

import page.object.AccesContPage;

public class AccesContActions extends AccesContPage {

    public static void fillInRegisteredUserAndAccessAccount(String user, String password) {
        getInputEmailAddress().sendKeys(user);
        getInputPassword().sendKeys(password);
        getButtonAccessAccount().click();
    }


}
