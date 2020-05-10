package SanityTests;

import org.testng.annotations.Test;
import Utilities.CommonOps;
import WorkFlows.newSign;

public class LoginPage extends CommonOps {

    @Test
    public void test01_FirstRegistration() {
        newSign.createAnAccount("Sapir11@gmail.com");
    }

    @Test
    public void test02_PersonalInformationPage() {
        newSign.personalInformationPage("Sapir", "Abargil", "12345678910");
    }
}
