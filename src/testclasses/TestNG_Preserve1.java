package testclasses;

import org.testng.annotations.Test;

public class TestNG_Preserve1 {

    @Test
    public void testMethod1() {
        System.out.println("TestNG_Preserve1 --> testMethod1");
    }

    @Test
    public void testMethod2() throws InterruptedException {
        System.out.println("TestNG_Preserve1 --> testMethod2");
        Thread.sleep(200);
    }
}
