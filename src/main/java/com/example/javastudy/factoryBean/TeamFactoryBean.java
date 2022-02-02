package com.example.javastudy.factoryBean;

import org.springframework.beans.factory.FactoryBean;

import java.util.Map;

public class TeamFactoryBean implements FactoryBean<Map<String, String>> {

    private Team team;

    // 생성자로 객채를 받아온다
    public TeamFactoryBean(Team team){
        this.team = team;
    }

    // 실제로 bean 을 생성하 객채 설정 
    @Override
    public Map<String, String> getObject() throws Exception {
        return team.getMap();
    }

    // 리턴타입 설정 
    @Override
    public Class<?> getObjectType() {
        return Map.class;
    }

    // 싱클톤 유무 설정
    @Override
    public boolean isSingleton() {
        return true;
    }
}
