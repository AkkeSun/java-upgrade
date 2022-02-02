package com.example.javastudy.proxy.functionUpgrade;

import com.example.javastudy.proxy.DefaultTestService;
import com.example.javastudy.proxy.TestService;

public class MainClass {

    public static void main(String[] args) {
        TestService testService1 = new TestServiceProxy1(new DefaultTestService());
        TestService testService2 = new TestServiceProxy2();

        testService1.getMsg();
        testService2.getMsg();

    }
}
