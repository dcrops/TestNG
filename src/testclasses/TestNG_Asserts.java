package testclasses;

import appcode.SomeClassToTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Asserts {


    @Test
    public void testSum() {
        System.out.println("\nRunning test --> testSum");
        SomeClassToTest obj = new SomeClassToTest();
        int result = obj.sumNumbers(1, 2);
        Assert.assertEquals(result, 3);

    }

    @Test
    public void testStrings() {
        System.out.println("\nRunning test --> testStrings");
        String expectedString = "Hello World";
        SomeClassToTest obj = new SomeClassToTest();
        String result = obj.addStrings("Hello", "World");
        Assert.assertEquals(result, expectedString);
    }

    @Test
    public void testArrays() {
        System.out.println("\nRunning test --> testArrays");
        int[] expectedArray = {1, 2, 3, 4};
        SomeClassToTest obj = new SomeClassToTest();
        int[] result = obj.getArray();
        Assert.assertEquals(result, expectedArray);

    }
}
