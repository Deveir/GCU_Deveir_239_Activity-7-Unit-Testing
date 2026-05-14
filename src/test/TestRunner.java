package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(AssertionTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("Total Tests Run: " + result.getRunCount());
        System.out.println("Total Failures: " + result.getFailureCount());
        System.out.println("Were all tests successful? " + result.wasSuccessful());
    }
}