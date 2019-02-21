package org.andestech.learning.rfb18.g3;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class App {

    public static void main(String[] args)
    {
        Result result = JUnitCore.runClasses(App2Test.class,AppTest.class);

        if(!result.wasSuccessful()){

            for(Failure fail: result.getFailures())
            {
                System.out.println("Trace:" + fail.getTrace());
                System.out.println("Header: " + fail.getTestHeader());
                System.out.println("Message: " + fail.getMessage());

            }


        }
        else {
            System.out.println("Success!!!");

        }

    }
}
