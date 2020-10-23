package com.practice.fizz;

import java.io.Serializable;

public class Fizz {

    public Serializable gamePlan(long i) {
        if(i==0)
            return i;
        else if(i%5==0 && i%3==0)
            return "fizz buzz";
        else if(i%3==0)
            return "fizz";
        else if(i%5==0)
            return "buzz";
        else
            return i;
    }
}
