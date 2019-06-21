package base;

import org.testng.annotations.*;

public class BaseTestSuite {

    @BeforeClass
    public void classsetup() {

        System.out.println("\nBaseTestSuite --> before class");
    }

    @AfterClass
    public void classcleanup() {

        System.out.println("\nBaseTestSuite --> after class");
    }

    @BeforeTest
    public void beforeTest() {

        System.out.println("\nBaseTestSuite --> before test");
    }

    @AfterTest
    public void afterTest() {

        System.out.println("\nBaseTestSuite --> after test");
    }

    @BeforeSuite
    public void suitesetup() {

        System.out.println("\nBaseTestSuite --> before suite");
    }

    @AfterSuite
    public void suitecleanup() {

        System.out.println("\nBaseTestSuite --> after suite");
    }
}
