package listenerspackage;

import org.testng.*;

public class CustomListeners implements IInvokedMethodListener, ITestListener, ISuiteListener{

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        //Before every method in the test class
        System.out.println("Before Invocation: " + testResult.getTestClass().getName() +
                " --> " + method.getTestMethod().getMethodName());
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        //Before every method in the test class
        System.out.println("After Invocation: " + testResult.getTestClass().getName() +
                " --> " + method.getTestMethod().getMethodName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        //When test method starts, not on the Before and After Methods
        System.out.println("onTestStart: --> Test Name: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        //If test method is successfull
        System.out.println("onTestSuccess: --> Test Name: " + result.getName());

    }

    @Override
    public void onTestFailure(ITestResult result) {
        //If test method fails
        System.out.println("onTestFailure: --> Test Name: " + result.getName());

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        //If test method is skipped
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {
        //Before <test> tag of xml file
        System.out.println("onStart: --> Test Tag Name: " + context.getName());
        ITestNGMethod methods[] = context.getAllTestMethods();
        System.out.println("These methods will be executed in this test tag");
        for (ITestNGMethod method:methods) {
            System.out.println(method.getMethodName());
        }
    }

    @Override
    public void onFinish(ITestContext context) {
        //After <test> tag of xml file
        System.out.println("onFinish: --> Test Tag Name: " + context.getName());
    }

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
