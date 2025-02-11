package com.muhammedalikirtay._1_week;

import java.util.Scanner;

public class week1_examples_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double C, F;
        System.out.println("C=");
        C=scanner.nextInt();
        F=(C*9/5)+32;
        System.out.println("F="+F);
        scanner.close();
    }
}
