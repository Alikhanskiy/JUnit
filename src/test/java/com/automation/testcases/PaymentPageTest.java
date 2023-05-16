package com.automation.testcases;

import com.automation.categories.SmokeTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class PaymentPageTest extends BaseTest {
    @Test
    public void verifyUserPutFullName(){
        System.out.println("Verify user put full name");
    }
    @Test
    public void verifyUserPutBillingAddress(){
        System.out.println("Verify user put billing address");
    }
    @Test
    @Category(SmokeTest.class)
    public void verifyUserPutValidCreditCard(){
        System.out.println("Verify user put valid credit card");
    }
}
