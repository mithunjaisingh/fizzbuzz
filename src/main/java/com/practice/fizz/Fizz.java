package com.practice.fizz;

import java.io.Serializable;

public class Fizz {

    public Serializable gamePlan(int i) {
        if(i==0)
            return i;
        if(i%5==0 && i%3==0)
            return "fizz buzz";
        if(i%3==0)
            return "fizz";
        if(i%5==0)
            return "buzz";
        return i;
    }
}
