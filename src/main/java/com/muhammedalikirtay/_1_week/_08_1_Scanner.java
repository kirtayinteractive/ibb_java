package com.muhammedalikirtay._1_week;

import java.util.Scanner;

public class _08_1_Scanner {
    public static void main(String[] args) {
        int languages;
        String name,surname;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen adınızı girin:");
        name=scanner.next();

        System.out.println("Lütfen soyadınızı girin:");
        surname=scanner.nextLine();

        System.out.println("Diller");
        languages=scanner.nextInt();

        System.out.println("Adınız: "+name+" Soyadınız: "+surname+""+"\ndiller: "+languages);

        //kullanmadığın Scanner nesnesini kapat

        scanner.close();

    }
}
