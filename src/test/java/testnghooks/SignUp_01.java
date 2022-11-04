package testnghooks;

import org.testng.annotations.*;

public class SignUp_01 {
    @BeforeSuite
    public void loginBeforeSuite(){
        System.out.println("SignUp_01 BeforeSuite");
    }
    @BeforeTest
    public void loginBeforeTest() {
        System.out.println("|___ SignUp_01 BeforeTest");
    }
    @BeforeClass
    public void loginBeforeClass() {
        System.out.println("|________ SignUp_01 BeforeClass");
    }


    @AfterSuite
    public void LoginAfterSuite() {
        System.out.println("SignUp_01 AfterSuite");
    }
    @AfterTest
    public void LoginAfterTest(){
        System.out.println("|_____ SignUp_01 AfterTest");
    }
    @AfterClass
    public void LoginAfterClass(){
        System.out.println("|__________ SignUp_01 AfterClass");
    }

    @Test
    public void loginWithCorrectCredentials() {
        System.out.println("|________________ This is SignUp_01 test");
    }
}
