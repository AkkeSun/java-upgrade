package com.example.javastudy.templateMethod;

public class ChildClass extends SuperClass{

    @Override
    protected void hook1() {
        System.out.println("ABSTRACT hook1 implementation");
    }

    @Override
    protected void hook2() {
        System.out.println("ABSTRACT hook2 implementation");
    }

    public void myMethod() {
        System.out.println("임의로 구현하는 매서드 ");
    }
}
