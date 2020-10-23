package com.practice.fizz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FizzTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void ifValidNumberIsSent()
    {
        Fizz fizz = new Fizz();
        int value =fizz.gamePlan(0);
        assertEquals( 0,value );
    }
}
