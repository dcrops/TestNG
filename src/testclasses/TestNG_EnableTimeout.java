package testclasses;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_EnableTimeout {

    @BeforeClass
    public void setup() {

        System.out.println("TestNG_DependentTests --> Before Class");
    }

    @AfterClass
    public void cleanup() {
        System.out.println("TestNG_DependentTests --> After Class");
    }

    @Test(enabled=false)
    public void testMethod1() {
        System.out.println("TestNG_DependentTests --> testMethod1");
    }

    @Test(timeOut = 100)
    public void testMethod2() throws InterruptedException {
        System.out.println("TestNG_DependentTests --> testMethod2");
        Thread.sleep(150);
    }

}
