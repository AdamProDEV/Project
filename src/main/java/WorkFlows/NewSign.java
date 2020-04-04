package WorkFlows;

import Extensions.UiActions;
import Utilities.CommonOps;
import org.openqa.selenium.WebElement;

public class NewSign extends CommonOps {

    public static void CreateAnAccount(String email) {
        UiActions.sendKeys(firstPageRegistration.elem_newEmail, email);
        UiActions.Click(firstPageRegistration.btn_creatAnAccount);
    }

    public static void informationPage(String firstName, String lastName, String password){
        UiActions.Click(secondePageRegistration.btn_gender);
        UiActions.sendKeys(secondePageRegistration.elem_Firstname, firstName);
        UiActions.sendKeys(secondePageRegistration.elem_LastName, lastName);
        UiActions.sendKeys(secondePageRegistration.elem_Paswword, password);
    }

}
