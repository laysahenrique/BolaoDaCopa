package com.laysafontoura.model;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class NationalTeam{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCoutry;
    @Column
    private String coutry;
    @Column
    private int points;
    @Column
    private int played;
    @Column
    private int won;
    @Column
    private int lost;
    @Column
    private int drawn;
    @Column
    private int goalsFor;
    @Column
    private int goalsAgainst;

    public int getIdCoutry() {
        return idCoutry;
    }

    public void setIdCoutry(int idCoutry) {
        this.idCoutry = idCoutry;
    }

    public String getCoutry() {
        return coutry;
    }

    public void setCoutry(String coutry) {
        this.coutry = coutry;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPlayed() {
        return played;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public int getDrawn() {
        return drawn;
    }

    public void setDrawn(int drawn) {
        this.drawn = drawn;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public void setGoalsFor(int goalsFor) {
        this.goalsFor = goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(int goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }
}