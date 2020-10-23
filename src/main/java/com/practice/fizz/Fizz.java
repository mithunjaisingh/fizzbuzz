package com.practice.fizz;

import java.io.Serializable;

public class Fizz {

    public Serializable gamePlan(int i) {
        if(i%3==0)
            return "fizz";
        return i;
    }
}
