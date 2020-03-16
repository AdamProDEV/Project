package sanityTests;

import org.testng.annotations.Test;
import utilities.CommonOps;
import workFlows.NewSign;

public class LoginPage extends CommonOps {

    @Test
    public void test01_newLogin(){
        NewSign.firstLogin("Sapir11@gmail.com");
    }
}
