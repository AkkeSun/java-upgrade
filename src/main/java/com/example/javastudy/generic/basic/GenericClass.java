package com.example.javastudy.generic.basic;

// 임의의 참조형 타입을 선언
// 객채 생성시 타입을 지정한다
public class GenericClass <U>  {

    private U u;

    public GenericClass (){};

    public void setU(U u){
        this.u = u;
    }

    public U getU(){
        return u;
    }
}
