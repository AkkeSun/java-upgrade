package com.example.javastudy.proxy.functionUpgrade;

import com.example.javastudy.proxy.DefaultTestService;
import com.example.javastudy.proxy.TestService;

// service 를 생성해서 새용한느 방식
public class TestServiceProxy2 implements TestService {

    private TestService testService;

    public TestServiceProxy2(){
      testService = new DefaultTestService();
    }

    @Override
    public void getMsg() {
        testService.getMsg();
        System.out.println("Hello Proxy2");
    }
}
