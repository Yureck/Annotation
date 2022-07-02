package com.sample;

import com.sample.Calc;

import java.lang.reflect.*;

public class Main {

    public static void main(String[] args) {

        Class<?> cls = Calc.class;
        Calc obj = new Calc();

        Method[] methods = cls.getDeclaredMethods();

        for (Method method:methods) {
            if(method.isAnnotationPresent(Test.class)){
                Test an = method.getAnnotation(Test.class);
                try {
                    method.invoke(obj, an.a(), an.b() );
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
