package com.laysafontoura.model;

public class Guess{
    private NationalTeam winner;
    private int homeGoals;
    private int visitorGoals;
    private String gameScore;

    public Guess() {
    }

    public Guess(NationalTeam winner, int homeGoals, int visitorGoals, String gameScore) {
        this.winner = winner;
        this.homeGoals = homeGoals;
        this.visitorGoals = visitorGoals;
        this.gameScore = gameScore;
    }

    public NationalTeam getWinner() {
        return winner;
    }

    public void setWinner(NationalTeam winner) {
        this.winner = winner;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(int homeGoals) {
        this.homeGoals = homeGoals;
    }

    public int getVisitorGoals() {
        return visitorGoals;
    }

    public void setVisitorGoals(int visitorGoals) {
        this.visitorGoals = visitorGoals;
    }

    public String getGameScore() {
        return gameScore;
    }

    public void setGameScore(String gameScore) {
        this.gameScore = gameScore;
    }
}