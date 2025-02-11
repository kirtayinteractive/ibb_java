package com.muhammedalikirtay._1_week;

public class _04_4_Autoboxing_Boxing {
    public static void main(String[] args) {
        //Autoboxing
        int primitiveValue=100;
        Integer wrapperValue=primitiveValue;//Autoboxing
        System.out.println("primitive type: "+primitiveValue+" wrapper type: "+wrapperValue);

        //Unboxing
        Integer wrapperValue2=200;
        int primitiveValue2=wrapperValue2;//Unboxing
        System.out.println("primitive type2: "+primitiveValue2+" wrapper type2: "+wrapperValue2);
    }
}
