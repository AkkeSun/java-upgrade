package com.example.javastudy.generic.methodExample;

// 메소드 파라미터 제한하기
public class ChildClass<U> extends ParentClass{

    public <A> void getMsg2(A a){
        System.out.println(a);
    }

    // 부모클래스만 파라미터로 받아들이겠다
    public <T extends ParentClass> void getMsg(T t){
        System.out.println(t.getT());
    }
}
