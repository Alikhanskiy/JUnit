package com.automation.runner;


import com.automation.categories.RegressionTest;
import com.automation.testcases.*;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({CartPageTest.class,loginTest.class, SearchFunctionalityTest.class,
OrderCancellationTest.class, PaymentPageTest.class})

public class TestRunner {
}
