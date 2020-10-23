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
        int value =(Integer) fizz.gamePlan(1);
        assertEquals( 1,value );
    }

    @Test
    public void ifNegativeNumberIsSetItShouldReturnTheNegativeNumber()
    {
        int value =(Integer)fizz.gamePlan(-2);
        assertEquals(-2,value);
    }

    @Test
    public void ifMultiplierBy3IsSent()
    {
        String value = (String)fizz.gamePlan(3);
        assertEquals("fizz",value);
    }

    @Test
    public void ifMultiplierByNegative3IsSent()
    {
        String value = (String)fizz.gamePlan(-369 );
        assertEquals("fizz",value);
    }

    @Test
    public void if0IsSentThenReturnZero()
    {
        int value=(Integer) fizz.gamePlan(0);
        assertEquals(0,value);
    }

    @Test
    public void ifMultiplierBy5IsSent()
    {
        String value = (String)fizz.gamePlan(20);
        assertEquals("buzz",value);
    }

    @Test
    public void ifMultiplierByNegative5IsSent()
    {
        String value = (String)fizz.gamePlan(-400 );
        assertEquals("buzz",value);
    }

    @Test
    public void ifMultiplierBy5And3IsSent()
    {
        String value = (String)fizz.gamePlan(15 );
        assertEquals("fizz buzz",value);
    }

    @Test
    public void ifNegativeMultiplierBy5And3IsSent()
    {
        String value = (String)fizz.gamePlan(-330 );
        assertEquals("fizz buzz",value);
    }
}
