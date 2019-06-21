package regressionsuite;

import org.testng.annotations.*;

public class TestNG_TestClass1 {

    @BeforeClass
    public void setup() {
        System.out.println("TestNG_TestClass1 --> before class");
    }

    @AfterClass
    public void cleanup() {
        System.out.println("TestNG_TestClass1 --> after class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("TestNG_TestClass1 --> before every method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("TestNG_TestClass1 --> after every method");
    }

    @Test
    public void testeMethod1() {
        System.out.println("Running Test --> TestNG_TestClass1 --> testMethod1");
    }
    @Test
    public void testeMethod2() {
        System.out.println("Running Test --> TestNG_TestClass1 --> testMethod2");
    }
}
