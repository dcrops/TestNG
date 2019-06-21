package regressionsuite;

import base.BaseTestSuite;
import org.testng.annotations.*;

public class TestNG_TestClass2 extends BaseTestSuite {

    @Test
    public void f () {

    }
    @BeforeClass
    public void setup() {
        System.out.println("TestNG_TestClass2 --> This runs once before class");
    }

    @AfterClass
    public void cleanup() {
        System.out.println("TestNG_TestClass2 --> This runs once after class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("TestNG_TestClass2 --> This runs before every method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("TestNG_TestClass2 --> This runs after every method");
    }

    @Test
    public void testeMethod1() {
        System.out.println("Running Test --> TestNG_TestClass2 --> testMethod1");
    }
    @Test
    public void testeMethod2() {
        System.out.println("Running Test --> TestNG_TestClass2 --> testMethod2");
    }
}
