package com.laysafontoura.model;

public class RankingPlayers{
    private Player player;
    private int points;

    public RankingPlayers() {
    }

    public RankingPlayers(Player player, int points) {
        this.player = player;
        this.points = points;
    }
    
    public RankingPlayers updateRankingPlayers(RankingPlayers ranking){
        return ranking;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}