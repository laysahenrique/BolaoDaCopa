package com.laysafontoura.model;

public class GroupPhase {
    private String idGroup;
    private String teams;

    public NationalTeam updateRankingTeams(NationalTeam team){
        return team;
    }

    public String getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(String idGroup) {
        this.idGroup = idGroup;
    }

    public String getTeams() {
        return teams;
    }

    public void setTeams(String teams) {
        this.teams = teams;
    }
}
