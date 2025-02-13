package com.muhammedalikirtay._2_week;

public class _13_2_MethodIsReturn {
    // 3- Returnlu Parametresiz
    public String metotReturnluParametresiz(){
        return "metot Returnlu Parametresiz";
    }
    // 4- Returnlu Parametreli
    public Integer metotReturnluParametreli(int a){
        return a;
    }

    public static void main(String[] args) {
        _13_2_MethodIsReturn isReturn1=new _13_2_MethodIsReturn();
        String result1= isReturn1.metotReturnluParametresiz();
        System.out.println(result1);

        Integer result2=isReturn1.metotReturnluParametreli(45124);
        System.out.println(result2);
    }
}
