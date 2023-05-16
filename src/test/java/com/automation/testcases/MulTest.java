package com.automation.testcases;

import com.dev.product.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class MulTest {
    Calculator cal;
    @Before
    public void setUp(){
        cal = new Calculator();

    }
    @Test
    public void testPositive(){
        int a = 500,b = 4 , expected = 2000;
        int actual = cal.mul(a, b);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testNegative(){
        int a = -3, b = -4,expected = 12;
        int actual = cal.mul(a, b);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testWithZero(){
        int a =10000, b = 0, expected = 0;
        int actual = cal.mul(a, b);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testWithZeros(){
        int a = 0, b = 0, expected = 0;
        int actual = cal.mul(a, b);
        Assert.assertEquals(expected, actual);
    }
}
