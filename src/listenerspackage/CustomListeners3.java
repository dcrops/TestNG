package listenerspackage;

import org.testng.*;

public class CustomListeners3 implements ISuiteListener {


    @Override
    public void onStart(ISuite suite) {
        //When <Suite> tag Starts
        System.out.println("onStart: before suite starts");
    }

    @Override
    public void onFinish(ISuite suite) {
        //When <Suite> tag Completes
        System.out.println("onFinish: after suite completes");
    }
}
