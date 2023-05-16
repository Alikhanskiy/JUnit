package com.automation.testcases;

import com.automation.categories.SmokeTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class OrderCancellationTest extends BaseTest{
    @Test
    @Category(SmokeTest.class)
    public void verifyToAskIfUserIsSureToCancel(){
        System.out.println("Verify to ask if user is sure to cancel");
    }
    @Test
    public void verifyIfCreditCardNumberIsRight(){
        System.out.println("Verify if credit card number is right");
    }
    @Test
    @Category(SmokeTest.class)
    public void verifyIfCancellationWasSuccessful(){
        System.out.println("Verify if cancellation was successful");
    }
}
