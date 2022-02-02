package com.example.javastudy.proxy.roleControl;

import com.example.javastudy.proxy.TestService;

public class MainClass {
    public static void main(String[] args) {
        TestService testService1 = new RoleControlProxy("role1");
        TestService testService2 = new RoleControlProxy("role2");
        TestService testService3 = new RoleControlProxy("role3");

        testService1.getMsg();
        System.out.println("=================");
        testService2.getMsg();
        System.out.println("=================");
        testService3.getMsg();

    }
}
