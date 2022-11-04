package testnghooks;

import org.testng.annotations.*;

public class Login_01 {
    @BeforeSuite
    public void loginBeforeSuite(){
        System.out.println("Login_01 BeforeSuite");
    }
    @BeforeTest
    public void loginBeforeTest() {
        System.out.println("|___ Login_01 BeforeTest");
    }
    @BeforeClass
    public void loginBeforeClass() {
        System.out.println("|________ Login_01 BeforeClass");
    }


    @AfterSuite
    public void LoginAfterSuite() {
        System.out.println("Login_01 AfterSuite");
    }
    @AfterTest
    public void LoginAfterTest(){
        System.out.println("|_____ Login AfterTest");
    }
    @AfterClass
    public void LoginAfterClass(){
        System.out.println("|__________ Login AfterClass");
    }

    @Test
    public void loginWithCorrectCredentials() {
        System.out.println("|________________ This is Login_01 test");
    }
}
