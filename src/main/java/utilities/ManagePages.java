package utilities;

import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Base {


    public static void init() {
        siteLogin = PageFactory.initElements(driver, pageObjects.Authentication.class);

    }

}
