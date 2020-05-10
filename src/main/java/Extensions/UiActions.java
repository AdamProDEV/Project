package Extensions;

import org.openqa.selenium.WebElement;
import Utilities.CommonOps;

public class UiActions extends CommonOps {

    public static void Click(WebElement elem) {
        elem.click();
    }

    public static void sendKeys(WebElement elem, String value) {
        elem.sendKeys(value);
    }


}
