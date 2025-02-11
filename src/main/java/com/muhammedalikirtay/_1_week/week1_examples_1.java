package com.muhammedalikirtay._1_week;

import java.util.Scanner;

public class week1_examples_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a,b=0,x;
        System.out.println("ax+b için\na=");
       a= scanner.nextInt();
        System.out.println("b=");
       b= scanner.nextInt();
        x=(-b/a);
        System.out.println("x="+x);
        scanner.close();
    }
}
