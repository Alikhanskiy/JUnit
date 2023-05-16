package com.automation.testcases;

import com.automation.categories.RegressionTest;
import com.automation.categories.SmokeTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class loginTest extends BaseTest{
    @Test
    @Category(SmokeTest.class)
    public void verifyUserCanLogin(){
        System.out.println("verify login successful");

    }
    @Test
    @Category(RegressionTest.class)
    public void verifyUserCannotLoginWithInvalidCredentials(){
        System.out.println("verify login unsuccessful for invalid credentials");
    }
    @Test
    public void verifyUserCanResetPassword(){
        System.out.println("verify user can reset password");
    }
}
