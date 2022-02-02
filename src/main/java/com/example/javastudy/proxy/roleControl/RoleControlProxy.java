package com.example.javastudy.proxy.roleControl;

import com.example.javastudy.proxy.DefaultTestService;
import com.example.javastudy.proxy.TestService;

public class RoleControlProxy implements TestService {

    private TestService testService;
    private String role;

    public RoleControlProxy(String role){
        this.role = role;
    }

    @Override
    public void getMsg() {
        if(testService == null)
            testService = new DefaultTestService();

        switch (role){
            case "role1" :
                testService.getMsg();
                break;
            case "role2" :
                testService.getMsg();
                System.out.println("role2");
                break;
            default:
                System.out.println("접근권한 없음");

        }

    }
}
