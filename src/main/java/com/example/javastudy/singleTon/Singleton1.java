package com.example.javastudy.singleTon;

// 기본 싱글톤 패턴 : 멀티 쓰레드에 취약점을 가지고 있음
public class Singleton1 {

    // 기본생성자를 private 로 줌으로 써 생성 불가 선언
    private Singleton1 () {}

    // static 객채 생성
    private static final Singleton1 INSTANCE = new Singleton1();

    // 리턴
    public static Singleton1 getInstance() {
        return INSTANCE;
    }

}
