package com.automation.testcases;

import com.automation.categories.RegressionTest;
import com.automation.categories.SmokeTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SearchFunctionalityTest extends BaseTest {
    @Test
    @Category(SmokeTest.class)
    public void verifySearchResultsAreDisplayed(){
        System.out.println("Verify search result");
    }
    @Test
    @Category(RegressionTest.class)
    public void verifyMessageWhenThereAreNoResult(){
        System.out.println("Verify No result message");
    }
    @Test
    public void verifySearchResultHasSearchKeyword(){
        System.out.println("Verify search result has search keyword");
    }
}
