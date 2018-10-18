package com.bell.b11.day8.exceptions;



public class Scenario1 {

    public static void main(String[] args){
        Scenario1 s1 = new Scenario1();
        s1.method1();

    }

    void method1(){
        System.out.println("I'm inside method1");
        method2();
    }

    void method2(){
        System.out.println("I'm inside method2");




    }
}
