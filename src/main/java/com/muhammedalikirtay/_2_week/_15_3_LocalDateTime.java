package com.muhammedalikirtay._2_week;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class _15_3_LocalDateTime {
    public static void localDateFormatGetMethod1(){
        LocalDateTime now=LocalDateTime.now();
        Locale locale=new Locale("tr","TR");
        //DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss",locale);
        //DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyy-MMM-dd HH:mm:ss",locale);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyy-MMMM-dd HH:mm:ss",locale);

        System.out.println("Şu andaki zaman: "+now);
        System.out.println("Şu andaki zaman: "+now.format(formatter));

    }
    public static void localDateFormatGetMethod2(){
        LocalDateTime now= LocalDateTime.now();
        System.out.println("Gün: "+now.getDayOfMonth());
        System.out.println("Kaçıncı Ay: "+now.getMonthValue());
        System.out.println("Kaçıncı Yıl: "+now.getYear());
        System.out.println("Saat: "+now.getHour());
        System.out.println("dakika: "+now.getMinute());
        System.out.println("saniye: "+now.getSecond());
        System.out.println("######################");

    }
    public static void localDateFormatSetMethod2(){
        Locale locale=new Locale("tr","TR");
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss",locale);
        LocalDateTime now=LocalDateTime.now();
        LocalDateTime newData= now
                .withDayOfMonth(11)
                .withMonth(12)
                .withYear(2029)
                .withHour(14)
                .withMinute(44)
                .withSecond(23);
        System.out.println("Normal Tarih:"+now);
        System.out.println("Değiştirilmiş:"+newData.format(formatter));
    }
    public static void main(String[] args) {
        //localDateFormatGetMethod1();
        localDateFormatSetMethod2();
    }
}
