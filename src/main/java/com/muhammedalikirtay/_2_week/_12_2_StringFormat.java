package com.muhammedalikirtay._2_week;

import java.util.Formatter;

public class _12_2_StringFormat {

    public  static void formatter1(){
        //Eğer new Formatter yazarsak close() ile manuel
        Formatter formatter=new Formatter();
        formatter.format(" Merhabalar Adınız:%s, Numaranız:%d, T.C.:%d, Fiyat:%f","Muhammed Ali",21,12345,25.5);
        System.out.println(formatter);
        formatter.close();
    }


    public  static void formatter2(){
        // Eğer String.format() close gerek yok GC(Garbage Collector) otomatik çalışır
       String formatterString=String.format(" Merhabalar Adınız:%s, Numaranız:%d, T.C.:%d, Fiyat:%f","Muhammed Ali",21,12345,25.5);
        System.out.println(formatterString);
    }

    public  static void formatter3(){
        String formatterString = String.format("Merhabalar Adınız: %s, T.C: %d, Fiyat: %f ", "Muhammed Ali", 123456, 25.5);
        System.out.println(formatterString);
    }
    public  static void formatter4(){

        String name = "Muhammed Ali";
        int tcNumber = 123456;
        double price = 25.5;
        System.out.printf("Merhabalar Adınız: %s, T.C: %d, Fiyat: %f ", name, tcNumber, price);
        System.out.println();
        System.out.printf("Merhabalar Adınız: %10s, T.C: %d, Fiyat: %f ", name, tcNumber, price); //%10s: Sağdan 10 karakter genişliğinde
        System.out.println();
        System.out.printf("%-15s %-15d %.3f ", name, tcNumber, price);//%-15s: Sola doğru yasla
    }

    public static void main(String[] args) {
        //formatter1();
        //formatter2();
        formatter4();
    }
}
