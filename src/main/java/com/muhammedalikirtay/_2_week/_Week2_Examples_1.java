package com.muhammedalikirtay._2_week;

import java.util.Scanner;

public class _Week2_Examples_1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Pozitif sayı gir");
        int a=scanner.nextInt();
        if(a<0){
            System.out.println("Sayı negatif");{
                a=a*(-1);
            }
        }
                if(a%2==0){
                    System.out.println(a+"Çifttir");
                }
                else {
                    System.out.println(a+"Tektir");
                }
    }
}
