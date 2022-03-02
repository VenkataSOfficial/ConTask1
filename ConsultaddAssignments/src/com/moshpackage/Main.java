package com.moshpackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                                                    //Swap Two numbers using third variable

        int a = 10;
        int b = 20;
        int c;

        System.out.println("Before Swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        c = b;
        b = a;
        a = c;

        System.out.println("After swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);



                                                //   Swap Two numbers without using third variable

        System.out.println("Before Swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a+b;
        b = a-b;
        a = a-b;


        System.out.println("After swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
