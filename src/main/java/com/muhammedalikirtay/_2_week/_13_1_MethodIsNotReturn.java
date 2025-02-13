package com.muhammedalikirtay._2_week;

public class _13_1_MethodIsNotReturn {
    // 1- Metotar(Returnsuz Parametresiz)
    public void metotReturnsuzParametresiz(){
        System.out.println("metotReturnsuzParametresiz");
    }
    // 2- Metotar(Returnsuz Parametreli)
    public static void metotReturnsuzParametreli(String name){
        System.out.println("metotReturnsuzParametreli "+name);
    }
    //Overloading(Aşırı Yüklemnek)
    public static void metotReturnsuzParametreli(String name,String surname){
        System.out.println("metotReturnsuzParametreli "+name);
    }
    //new
    //static
    public static void main(String[] args) {
        _13_1_MethodIsNotReturn data1=new _13_1_MethodIsNotReturn();
        data1.metotReturnsuzParametresiz();

        //instance(new) olmadan static ile çağırdım
        _13_1_MethodIsNotReturn.metotReturnsuzParametreli("Mali");
        _13_1_MethodIsNotReturn.metotReturnsuzParametreli("Mali","Kırtay");
    }
}
