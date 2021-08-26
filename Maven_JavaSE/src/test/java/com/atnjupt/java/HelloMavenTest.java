package com.atnjupt.java;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Wizarder
 * @create 2021-07-13 14:43
 */
public class HelloMavenTest {
    @Test
    public void addTest(){
        System.out.println("addTest()的测试");
        int res = HelloMaven.add(10, 20);
        Assert.assertEquals(30,res);

    }
}
