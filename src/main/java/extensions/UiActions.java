package extensions;

import org.openqa.selenium.WebElement;
import utilities.CommonOps;

public class UiActions extends CommonOps {

    public static void Click (WebElement elem){
        elem.click();
    }
    public static void updateText (WebElement elem, String value){
        elem.sendKeys(value);
    }

//    public static void updateDropDown (WebElement elem, String value){
//        Select myValue = new Select(elem);
//        myValue.deselectByVisibleText(value);
//
//    }
}
