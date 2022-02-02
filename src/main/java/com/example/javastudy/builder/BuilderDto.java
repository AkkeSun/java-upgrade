package com.example.javastudy.builder;

/**
 * [builder 를 통한 객채 생성 -> setter 객채 생성의 문제점 해결]
 *
 * 기존의 문제점 1. 인스턴스를 하나 생성하려면 다른 매서드를 여러 개 생성해야한다
 * 기존의 문제점 2. 런타임 시에 버그가 발생하면 문제가 발생한 코드는 물리적으로 멀리 떨어져 있으므로 디버깅이 어려워진다
 * 기존의 문제점 3. 변수에 final 을 사용할 수 없으므로 불변 클래스를 만들 수 없다
 *
 */
public class BuilderDto {

    private final String data1;
    private final String data2;
    private final String data3;
    private final String data4;
    private final String data5;

    public BuilderDto(Builder builderDto){
        this.data1 = builderDto.data1;
        this.data2 = builderDto.data2;
        this.data3 = builderDto.data3;
        this.data4 = builderDto.data4;
        this.data5 = builderDto.data5;
    }

    public static class Builder{

        // 필수 매개변수
        private final String data1;
        private final String data2;

        // 선택적 매개변수
        private String data3;
        private String data4;
        private String data5;

        public Builder(String data1, String data2) {
            this.data1 = data1;
            this.data2 = data2;
        }
        public Builder data3(String data3){
            this.data3 = data3;
            return this;
        }
        public Builder data4(String data4){
            this.data4 = data4;
            return this;
        }
        public Builder data5(String data5){
            this.data5 = data5;
            return this;
        }
        public BuilderDto build(){
            return new BuilderDto(this);
        }

    }

}
