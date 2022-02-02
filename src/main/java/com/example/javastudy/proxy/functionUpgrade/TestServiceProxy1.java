package com.example.javastudy.proxy.functionUpgrade;

import com.example.javastudy.proxy.TestService;

// service 를 주입받아 사용하는 방식
public class TestServiceProxy1 implements TestService {

    private TestService testService;

    public TestServiceProxy1 (TestService testService){
        this.testService = testService;
    }

    @Override
    public void getMsg() {
        testService.getMsg();
        System.out.println("Hello Proxy1");
    }
}
