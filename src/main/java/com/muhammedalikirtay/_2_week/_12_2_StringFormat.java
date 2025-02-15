package com.muhammedalikirtay._2_week;

import java.util.Formatter;

public class _12_2_StringFormat {

    public  static void formatter1(){
        Formatter formatter=new Formatter();
        formatter.format(" Merhabalar Adınız:%s, Numaranız:%d, T.C.:%d, Fiyat:%f","Muhammed Ali",21,12345,25.5);
        System.out.println(formatter);
        formatter.close();
    }

    public  static void formatter2(){
       String formatterString=String.format(" Merhabalar Adınız:%s, Numaranız:%d, T.C.:%d, Fiyat:%f","Muhammed Ali",21,12345,25.5);
        System.out.println(formatterString);
    }

    public  static void formatter3(){

    }

    public static void main(String[] args) {
        //formatter1();
        //formatter2();
        formatter3();
    }
}
