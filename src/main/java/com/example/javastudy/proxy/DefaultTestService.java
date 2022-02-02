package com.example.javastudy.proxy;

public class DefaultTestService implements TestService{

    @Override
    public void getMsg() {
        System.out.println("DefaultTestService msg");
    }
}
