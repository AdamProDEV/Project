package WorkFlows;

import Extensions.UiActions;
import Utilities.CommonOps;

public class NewSign extends CommonOps {

    public static void CreateAnAccount(String email) {
        UiActions.sendKeys(firstPageRegistration.elem_newEmail, email);
        UiActions.Click(firstPageRegistration.btn_creatAnAccount);
    }

    public static void informationPage(String firstName, String lastName, String password){
        UiActions.Click(secondPageRegistration.btn_gender);
        UiActions.sendKeys(secondPageRegistration.elem_Firstname, firstName);
        UiActions.sendKeys(secondPageRegistration.elem_LastName, lastName);
        UiActions.sendKeys(secondPageRegistration.elem_Paswword, password);
    }

}
