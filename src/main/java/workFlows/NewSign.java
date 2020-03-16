package workFlows;

import extensions.UiActions;
import utilities.CommonOps;

public class NewSign extends CommonOps {

    public static void firstLogin(String email) {
        UiActions.updateText(siteLogin.elem_newEmail, email);
        UiActions.Click(siteLogin.btn_createNew);
    }

}
