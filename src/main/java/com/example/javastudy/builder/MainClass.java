package com.example.javastudy.builder;

public class MainClass {

    public static void main(String[] args) {
        BuilderDto builderDto = new BuilderDto.Builder("data1", "data2")
                                    .data3("data3")
                                    .data4("data4")
                                    .data5("data5")
                                    .build();
    }
}
