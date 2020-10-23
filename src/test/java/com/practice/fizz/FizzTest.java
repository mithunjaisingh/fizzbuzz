package com.practice.fizz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FizzTest
{
    Fizz fizz;
    @Before
    public void Setup()
    {
        fizz = new Fizz();
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void ifValidNumberIsSent()
    {
        int value =fizz.gamePlan(0);
        assertEquals( 0,value );
    }

    @Test
    public void ifNegativeNumberIsSetItShouldReturnTheNegativeNumber()
    {
        int value =fizz.gamePlan(-2);
        assertEquals(-2,value);
    }
}
