package testclasses;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name="inputs")
    public Object[][] getData() {
        return new Object[][] {
                {"bmw", "m3"},
                {"audi", "a6"},
                {"benz", "c300"}
        };
    }

    @DataProvider(name="numbers")
    public Object[][] getData1() {
        return new Object[][] {
                {"1", "2"},
                {"3", "4"},
                {"5", "6"}
        };
    }
}
