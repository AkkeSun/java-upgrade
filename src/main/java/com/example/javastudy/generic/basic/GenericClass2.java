package com.example.javastudy.generic.basic;

// 복수의 타입 지정
public class GenericClass2 <T, U> {

    private T t;
    private U u;

    public GenericClass2 (){};

    public void setT(T t){
        this.t = t;
    }

    public T getT(){
        return t;
    }

    public void setU(U u){
        this.u = u;
    }

    public U getU(){
        return u;
    }
}
