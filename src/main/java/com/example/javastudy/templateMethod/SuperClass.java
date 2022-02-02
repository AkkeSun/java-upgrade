package com.example.javastudy.templateMethod;

/**
 * 상속을 통해 슈퍼클래스의 기능을 확장할 때 사용하는 가장 대표적인 방법.
 * 변하지 않는 기능은 슈퍼클래스에 만들어두고 자주 변경되며 확장할 기능은 서브클래스에서 만들도록 한다.
 * 알고리즘이 단계별로 나누어 지거나, 같은 역할을 하는 메소드이지만 여러곳에서 다른형태로 사용이 필요한 경우 유용한 패턴이다.
 */
public abstract class SuperClass {

    protected abstract void hook1();

    protected abstract void hook2();

    public void pattern1() {
        hook1();
        hook2();
    }

    public void pattern2() {
        hook2();
        hook1();
    }

}
