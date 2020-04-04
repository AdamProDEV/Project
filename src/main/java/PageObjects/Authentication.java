package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Authentication {


    // Login page new user
    @FindBy(id = "email_create")
    public WebElement elem_newEmail;

    @FindBy(id = "SubmitCreate")
    public WebElement btn_creatAnAccount;

    //Site registration
    @FindBy(id = "id_gender1")
    public WebElement btn_gender;

    @FindBy(id = "customer_firstname")
    public WebElement elem_Firstname;

    @FindBy(id = "customer_lastname")
    public WebElement elem_LastName;

    @FindBy(id = "passwd")
    public WebElement elem_Paswword;

//    @FindBy(id = "id_gender1")
//    public WebElement btn_gender;
//
//    @FindBy(id = "id_gender1")
//    public WebElement btn_gender;
//
//    @FindBy(id = "id_gender1")
//    public WebElement btn_gender;
//
//    @FindBy(id = "id_gender1")
//    public WebElement btn_gender;
//
//    @FindBy(id = "id_gender1")
//    public WebElement btn_gender;
//
//    @FindBy(id = "id_gender1")
//    public WebElement btn_gender;
//
//    @FindBy(id = "id_gender1")
//    public WebElement btn_gender;



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
