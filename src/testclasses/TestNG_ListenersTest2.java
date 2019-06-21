package testclasses;

//import listenerspackage.CustomListeners1;
//import listenerspackage.CustomListeners2;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(CustomListeners2.class)
public class TestNG_ListenersTest2 {

    @BeforeClass
    public void setUp() {
        System.out.println("Code in Before Class");
    }

    @Test
    public void testMethod1() {
        System.out.println("Code in testMethod1");
        Assert.assertTrue(true);
    }

    @Test
    public void testMethod2() {
        System.out.println("Code in testMethod2");
        Assert.assertTrue(false);
    }


}
