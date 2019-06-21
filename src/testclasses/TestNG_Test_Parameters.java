package testclasses;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Test_Parameters {

    @BeforeClass
    @Parameters({"browser", "platform"})
    public void setUp(String browser, String platform) {
        System.out.println("TestNG_Test_Parameters --> Setup");
        System.out.println("1. Parameter value from xml file: " + browser);
        System.out.println("2. Parameter value from xml file: " + platform);
    }

    @Test
    @Parameters({"response"})
    public void testMethod1(String response) throws InterruptedException{
        System.out.println("TestNG_Test_Parameters --> testMethod1");
        System.out.println("Response from xml file: " + response);
    }

    @Test
    @Parameters({"responses"})
    public void testMethod2(String responses) throws InterruptedException{
        String[] stringArray = responses.split(",");
        System.out.println("TestNG_Test_Parameters --> testMethod1");
        System.out.println("Response from xml file: " + responses);
        System.out.println("stringArray[0] from xml file: " + stringArray[0]);
        System.out.println("stringArray[1] from xml file: " + stringArray[1]);
        System.out.println("stringArray[2] from xml file: " + stringArray[2]);
    }
}
