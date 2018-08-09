package mum.cs475.lab7.lab7;

import mum.cs475.lab7.lab7.Calculator.MathApplicationTest;
import org.junit.runner.*;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(MathApplicationTest.class);
        System.out.println(result);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
