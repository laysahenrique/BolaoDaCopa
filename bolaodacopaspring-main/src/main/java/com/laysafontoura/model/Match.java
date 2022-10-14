package com.laysafontoura.model;

public class Match{
    private NationalTeam home;
    private int gameScore;
    private int visitorGoals;
    private int homeGoals;
    private NationalTeam winner;
    private NationalTeam visitor;
    private String date;

    public float setBonus(Match match){
        float bonus = 0;
        return bonus;
    }

    public NationalTeam getHome() {
        return home;
    }

    public void setHome(NationalTeam home) {
        this.home = home;
    }

    public int getGameScore() {
        return gameScore;
    }

    public void setGameScore(int gameScore) {
        this.gameScore = gameScore;
    }

    public int getVisitorGoals() {
        return visitorGoals;
    }

    public void setVisitorGoals(int visitorGoals) {
        this.visitorGoals = visitorGoals;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(int homeGoals) {
        this.homeGoals = homeGoals;
    }

    public NationalTeam getWinner() {
        return winner;
    }

    public void setWinner(NationalTeam winner) {
        this.winner = winner;
    }

    public NationalTeam getVisitor() {
        return visitor;
    }

    public void setVisitor(NationalTeam visitor) {
        this.visitor = visitor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}