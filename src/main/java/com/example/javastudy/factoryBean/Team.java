package com.example.javastudy.factoryBean;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Team {

    private String teamName;

    public Map<String, String> getMap(){
        Map<String, String> map = new HashMap<>();
        map.put("name", this.teamName);
        return map;
    }
}
