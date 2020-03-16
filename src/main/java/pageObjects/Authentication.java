package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Authentication {


    // Login page new user
    @FindBy(id = "email_create")
    public WebElement elem_newEmail;

    @FindBy(id = "SubmitCreate")
    public WebElement btn_createNew;


//    //Signed up user
//    @FindBy(id = "email")
//    public WebElement elemUser;
//
//    @FindBy(id = "passwd")
//    public WebElement elemPass;
//
//    @FindBy(id = "SubmitLogin")
//    public WebElement btn_login;


}
