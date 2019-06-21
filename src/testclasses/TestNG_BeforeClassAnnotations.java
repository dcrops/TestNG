package testclasses;

import org.testng.annotations.*;

public class TestNG_BeforeClassAnnotations {

    @BeforeClass
    public void setup() {
        System.out.println("\nThis runs once before class");
    }

    @AfterClass
    public void cleanup() {
        System.out.println("\nThis runs once after class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("\nThis runs before every method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("\nThis runs after every method");
    }

    @Test
    public void testeMethod1() {
        System.out.println("\nRunning Test --> testMethod1");
    }
    @Test
    public void testeMethod2() {
        System.out.println("\nRunning Test --> testMethod2");
    }
}
