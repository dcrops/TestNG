package testclasses;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import appcode.SomeClassToTest;

public class TestNG_DependentTests {

    SomeClassToTest obj;

    @BeforeClass
    public void setup() {
        obj = new SomeClassToTest();
        System.out.println("TestNG_DependentTests --> Before Class");
    }

    @AfterClass
    public void cleanup() {
        System.out.println("TestNG_DependentTests --> After Class");
    }

    @Test(dependsOnMethods = {"testMethod2"}, alwaysRun = true)
    public void testMethod1() {

        System.out.println("TestNG_DependentTests --> testMethod1");
    }

    @Test
    public void testMethod2() {
        int result = obj.sumNumbers(2, 9);
        Assert.assertEquals(result, 21);
        System.out.println("TestNG_DependentTests --> testMethod2");
    }

    @Test(dependsOnMethods = {"testMethod1"})
    public void testMethod3() {
        System.out.println("TestNG_DependentTests --> testMethod3");
    }

    @Test(dependsOnMethods = {"testMethod2"})
    public void testMethod4() {
        System.out.println("TestNG_DependentTests --> testMethod4");
    }
}
