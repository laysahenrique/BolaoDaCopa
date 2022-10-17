package com.laysafontoura.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class GroupPhase {
    @Id    
    private String idGroup;
    @Column
    private String teams;

    public GroupPhase(String idGroup, String teams) {
        this.idGroup = idGroup;
        this.teams = teams;
    }

    public GroupPhase() {
    }

    
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
