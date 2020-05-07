package SanityTests;

import org.testng.annotations.Test;
import Utilities.CommonOps;
import WorkFlows.NewSign;

public class LoginPage extends CommonOps {

    @Test
    public void test01_FirstRegistration(){
        NewSign.CreateAnAccount("Sapir11@gmail.com");
    }

    @Test
    public void test02_PersonalInformationPage(){
        NewSign.informationPage("Sapir", "Abargil", "12345678910");
    }
}
