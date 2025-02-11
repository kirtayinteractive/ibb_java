package com.muhammedalikirtay._2_week;

import java.util.Scanner;


public class _11_1_Return_Continue_Break {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Bir pozitif bir sayı giriniz");
        int number = Math.abs(scanner.nextInt());

        int sum = 0;

        for (int i = 1; i <= number; i++) {

            if (i == 47) {
                System.out.println("Verdiğiniz sayıda 47 olduğu için bunu toplamaya dahil etmiyoruz.");
                continue;
            }

            if (i > 100) {
                System.out.println("Verdiğiniz sayı 100 büyük olduğu için sadece 1<=SAYI<=100 kadar toplama yapabilir.");
                break;
            }

            sum += i;
        }

        System.out.println("Toplam: " + sum);


        if (sum % 2 == 0)
            System.out.println(sum + " sayı çift");
        else
            System.out.println(sum + " sayı tek");


        scanner.close();
    }
}
