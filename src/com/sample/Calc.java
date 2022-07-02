package com.sample;

public class Calc {

    @Test(a=2, b=5)
    public void test(int a, int b){
        System.out.println(a+b);
    }

    public void otherMethod(int a, int b){
        System.out.println(a + " "+ b);
    }
}
