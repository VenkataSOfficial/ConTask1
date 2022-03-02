package com.moshpackage;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
                                                            //Take input + Add and store in Z + Add 30 to Z

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        int a = sc.nextInt();
        System.out.println("Enter B");
        int b = sc.nextInt();

        int z = a + b;
        System.out.println("Z = " + z);

        z = z + 30;
        System.out.println("Z + 30 = " + z);
    }
}
