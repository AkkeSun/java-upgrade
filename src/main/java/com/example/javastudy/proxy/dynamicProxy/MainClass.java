package com.example.javastudy.proxy.dynamicProxy;

import com.example.javastudy.proxy.DefaultTestService;
import com.example.javastudy.proxy.TestService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 * [ 기존 프록시 패턴의 단점 ]
 * 1. 코드의 중복이 일어난다 (@Override)
 * 2. 컴파일 할 때 생성된다
 * 3. 셋팅이 번거롭다
 *
 * 다이나믹 프록시
 * 런타임 시 생성된다. 이를 확장한게 Spring AOP
 *
 * ClassLoader : 프록시를 정의할 클래스 로더
 * Class : 프록시 클래스가 구현하고자하는 인터페이스 목록 (배열)
 * InvocationHandler : 프록시의 메서드가 호출될때 처리되는 구현부
 *
 **/
public class MainClass {

    public static void main(String[] args) {

        TestService testService = (TestService) Proxy.newProxyInstance(MainClass.class.getClassLoader(),
                new Class[]{ TestService.class },
                new InvocationHandler() {

                    // 리얼 서브젝트가 여기 존재해야한다.
                    TestService testService = new DefaultTestService();

                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        // 실제 매소드 사용 전
                        System.out.println("pre workout invoked by Proxy");
                        // 실제 매소드 사용
                        Object invokedMethod = method.invoke(testService, args);
                        // 실제 매소드 사용 후
                        System.out.println("post relax invoked by Proxy");

                        return invokedMethod;
                    }
                });

        testService.getMsg();

    }
}
