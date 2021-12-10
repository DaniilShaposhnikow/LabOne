package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TestCheck
{
    @Test
    public void TestMethod1()
    {
        double myX = 0.6;
        double logX = Math.log(1 - myX);
        double myLogX = Main.MyLog(myX);
        System.out.println(logX);
        System.out.println(myLogX);
        Assert.assertEquals(logX, myLogX,0.000001);
    }
}

