package com.muhammedalikirtay._2_week;

import java.util.Scanner;

public class Week2_Examples_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int toplam=0;
        System.out.println("Pozitif Sayı Giriniz");
        int a=Math.abs(scanner.nextInt());
        for(int i=1;i<=a;i++){
           if(i==47) continue;
           if(i>100) break;
            toplam+=i;
        }
        System.out.println("Toplam: "+toplam);

        if(toplam%2==0)
            System.out.println(toplam+"sayısı çift");
        else
            System.out.println(toplam+"sayısı tek");
        scanner.close();
    }
}
