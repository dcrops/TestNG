package testclasses;

import org.testng.annotations.Test;

public class TestNG_Preserve2 {

    @Test
    public void testMethod1() {
        System.out.println("TestNG_Preserve2 --> testMethod1");
    }

    @Test
    public void testMethod2() throws InterruptedException {
        System.out.println("TestNG_Preserve2 --> testMethod2");
        Thread.sleep(200);
    }
}
