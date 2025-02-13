package com.muhammedalikirtay._2_week;

import java.io.IOException;
import java.util.Scanner;

public class _14_1_Exception {
    public static void main(String[] args) throws ArithmeticException, IOException,NullPointerException {
        Scanner scanner=new Scanner(System.in);

        int number1,numbr2;

        System.out.println("numara1:");
        number1=scanner.nextInt();

        System.out.println("numara2:");

        numbr2=scanner.nextInt();
        try{
            int result=number1/numbr2;
            System.out.println(result);

        }catch (ArithmeticException ai){
            ai.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            {
                System.out.println("istisna olsa da olmasa da çalıştır");
                scanner.close();
            }
        }
    }
}
