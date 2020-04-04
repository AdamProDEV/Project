package Utilities;

import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Base {


    public static void init() {
        firstPageRegistration = PageFactory.initElements(driver, PageObjects.Authentication.class);
        secondePageRegistration = PageFactory.initElements(driver, PageObjects.Authentication.class);

    }

}
