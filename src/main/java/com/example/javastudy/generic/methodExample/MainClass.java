package com.example.javastudy.generic.methodExample;

public class MainClass {

    public static void main(String[] args) {

        ChildClass<String> c = new ChildClass<>();
        ParentClass<Integer> p = new ParentClass<>();

        c.getMsg2("Hello");

        p.setT(123);
        c.getMsg(p);
    }
}
