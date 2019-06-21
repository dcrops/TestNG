package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Priority {

    @BeforeClass
    public void setup() {
        System.out.println("TestNG_Priority --> Before Class");
    }

    @AfterClass
    public void cleanup() {
        System.out.println("TestNG_Priority --> After Class");
    }

    @Test(priority = 1)
    public void testMethod1() {
        System.out.println("TestNG_Priority --> testMethod1");
    }

    @Test(priority = 3)
    public void testMethod2() {
        System.out.println("TestNG_Priority --> testMethod2");
    }

    @Test(priority = 0)
    public void testMethod3() {
        System.out.println("TestNG_Priority --> testMethod3");
    }

    @Test(priority = 2)
    public void testMethod4() {
        System.out.println("TestNG_Priority --> testMethod4");
    }
}
