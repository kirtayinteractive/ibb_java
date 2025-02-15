package com.muhammedalikirtay._2_week;

import java.util.Arrays;

public class _16_1_Array {
    public static String[] arrayMethod1() throws ArrayIndexOutOfBoundsException{
        String[] city=new String[6]; //eleman sayısı:6
        city[0]="Malatya";
        city[1]="Elazığ";
        city[2]="Bingöl";
        city[3]="Muş";
        city[5]="Van";
        System.out.println(city);
        System.out.println("Eleman sayısı:"+city.length);
        System.out.println(city[0]);
        System.out.println("Son eleman:"+city[city.length-1]);
        return city;

    }
    public static String[] arrayMethod2() throws ArrayIndexOutOfBoundsException{
        //String[] city= {"Malatya","Elazığ","Bingöl",null,"Muş","Van"}; //eleman sayısı:6
        String[] city= {"Malatya","Elazığ","Bingöl","Muş","Van"}; //eleman sayısı:6
        System.out.println(city);
        System.out.println("Eleman sayısı:"+city.length);
        System.out.println(city[0]);
        System.out.println("Son eleman:"+city[city.length-1]);
        return city;

    }
    //iterative for
    public  static void arrayMethod3(){
        String[] city=arrayMethod2();

        for(int i =0;i<city.length;i++){
            System.out.println(city[i]);
        }
    }
    //foreach
    public  static void arrayMethod4(){
        String[] city=arrayMethod2();

        for(String temp:city){
            System.out.println(temp);
        }
    }
    public  static void arrayMethod5(){
        String[] city=arrayMethod2();
        // Dizilerde Sıralama
        Arrays.sort(city);
        for(String temp:city){
            System.out.println(temp);
        }
    }
    public static void main(String[] args) {
        //arrayMethod3();
        //arrayMethod4();
        arrayMethod5();
    }
}
