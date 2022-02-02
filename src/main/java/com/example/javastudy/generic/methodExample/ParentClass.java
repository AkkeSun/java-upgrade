package com.example.javastudy.generic.methodExample;

// 부모 클래스
public class ParentClass<T>{

    private T t;

    public ParentClass(){};

    public void setT(T t){
        this.t = t;
    }

    public T getT(){
        return t;
    }
}
