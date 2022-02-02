package com.example.javastudy.generic.basic;


/**
 * object 의 경우 형변환이 필요하지만
 * Generic 은 형변환이 필요없다
  */
public class MainClass {

    // psvm
    public static void main(String[] args) {

        GenericClass <String> g1 = new GenericClass<>();
        g1.setU("Generic");
        String data1 = g1.getU();

        GenericClass <Integer> g2 = new GenericClass<>();
        g2.setU(123);
        Integer data2 = g2.getU();

        GenericClass2<String, Integer> g3 = new GenericClass2<>();
        g3.setT("Generic");
        g3.setU(123);
        String data3 = g3.getT();
        Integer data4 = g3.getU();

        ObjectClass obj = new ObjectClass();
        obj.setObj("Object");
        String data5 = (String)obj.getObj();

    }

}
