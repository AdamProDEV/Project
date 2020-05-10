package WorkFlows;

import Extensions.UiActions;
import Utilities.CommonOps;

public class newSign extends CommonOps {

    public static void createAnAccount(String email) {
        UiActions.sendKeys(firstPageRegistration.elem_newEmail, email);
        UiActions.Click(firstPageRegistration.btn_creatAnAccount);
    }

    public static void personalInformationPage(String firstName, String lastName, String password){
        UiActions.Click(secondPageRegistration.btn_gender);
        UiActions.sendKeys(secondPageRegistration.elem_Firstname, firstName);
        UiActions.sendKeys(secondPageRegistration.elem_LastName, lastName);
        UiActions.sendKeys(secondPageRegistration.elem_PassWord, password);
    }



}
