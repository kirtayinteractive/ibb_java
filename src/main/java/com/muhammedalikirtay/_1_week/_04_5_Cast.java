package com.muhammedalikirtay._1_week;

public class _04_5_Cast {
    public static void main(String[] args) {
    //1- Widening Cast - Implict Cast
        byte cast1Byte=100;
        int cast1Int=cast1Byte;
        System.out.println(cast1Int);

        //2 Narrowing Cast-Explicit Cast
        int cast2Int=241435852;
        byte cast2Byte=(byte) cast2Int;
        System.out.println(cast2Byte);

        // 3 char => INT
        char cast3Char='&';
        int ascii1=cast3Char;
        System.out.println(cast3Char+" harfi ascii karsılığı:"+ascii1);

        int cast3Int=38;
        char ascii2=(char)cast3Int;
        System.out.println(cast3Int+" ascii karşılığı:"+ascii2);

    //4- String =>int
        String cast4String="10";
        int cast4Int1=Integer.valueOf(cast4String);
        int cast4Int2=Integer.parseInt(cast4String);
        System.out.println(cast4String+20);
        System.out.println(cast4Int1+20);
        System.out.println(cast4Int2+20);

       // 5- int=> String

        int cast5Int=55;
        String cast5String1=String.valueOf(cast5Int);
        String cast5String2=cast5String1.toString();
        System.out.println(cast5String1);
        System.out.println(cast5String2);
    }
}
