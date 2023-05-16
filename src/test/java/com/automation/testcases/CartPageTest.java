package com.automation.testcases;

import com.automation.categories.RegressionTest;
import com.automation.categories.SmokeTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class CartPageTest extends BaseTest {
    @Test
    @Category(SmokeTest.class)
    public void verifyUserCanAddProductToCart(){
        System.out.println("Verify user can add item");
    }
    @Test
    @Category(RegressionTest.class)
    public void verifyUserCanRemoveItemFromCart() {
        System.out.println("Verify User can remove item");
    }
    @Test
    @Category(RegressionTest.class)
    public void verifyUserCanChangeQuantityOfItem(){
        System.out.println("Verify user can change quantity of item");
    }
}
