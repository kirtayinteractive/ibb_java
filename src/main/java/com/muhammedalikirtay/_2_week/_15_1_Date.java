package com.muhammedalikirtay._2_week;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class _15_1_Date {

    public static void dateMethod(){
        Date now=new Date();
        System.out.println("Şu anki zaman:"+now);;
        System.out.println(""+now.getTime());
        System.out.println("Date:"+now.getDate());
        System.out.println("##############");
        System.out.println("Day:" +now.getDay());
        System.out.println("Month:" +now.getMonth()); // saymaya 0 dan başlar 0=ocak 1=şubat
        System.out.println("Year:" +(1900+now.getYear())); //1900(ekle veta çıkar)
        System.out.println("Date Yıl:"+ (2025-now.getYear()));
        System.out.println("Hours:" +now.getHours());
        System.out.println("Minutes:" +now.getMinutes());
        System.out.println("Seconds:" +now.getSeconds());

    }

    public static String nowFormat1() throws NullPointerException{
        Date now=new Date();
        String specialFormat="Zaman:"
                .concat(String.valueOf(now.getHours()))
                .concat(":")
                .concat(String.valueOf(now.getMinutes()))
                .concat(":")
                .concat(String.valueOf(now.getSeconds()))
                .toString();
        return specialFormat;
    }
    public static String nowFormat2() throws NullPointerException{
        Date now=new Date();
        // %s String
        // %d Decimal
        // %f Float
        return String.format("Şimdiki Zaman:%02d:%02d:%02d",now.getHours(),now.getMinutes(),now.getSeconds());
    }
    public static String nowFormat3() throws NullPointerException{
        Date now=new Date();
        Locale locale=new Locale("tr","TR");
        //SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss",locale);
        //SimpleDateFormat sdf=new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss zzzz",locale);
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MMMM/yyyy hh:mm:ss zzzz",locale);
        String formatedDate=String.format("Şimdiki Zaman: %s",sdf.format(now));
        return new Date().toString()+" - "+formatedDate;
    }
    public static void main(String[] args) {
        //dateMethod();

        //String nowDate=nowFormat1();
        //System.out.println(nowDate);

        String nowDate2=nowFormat2();
        System.out.println(nowDate2);

        String nowDate3=nowFormat3();
        System.out.println(nowDate3);

    }
}
