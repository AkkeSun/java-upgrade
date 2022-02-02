package com.example.javastudy.factoryMethod;

// 입력받은 데이터를 바탕으로 객채를 생성하는 패턴
public class TeamFactory {

    public Team creatTeam(String teamName) {
        Team team = null;
        switch (teamName){
            case "A" : team = new TeamA(); break;
            case "B" : team = new TeamB(); break;
        }
        return team;
    }


}
