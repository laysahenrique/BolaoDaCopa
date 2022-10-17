package com.laysafontoura.model;

public class Player{
    private int idPlayer;
    private String name;

    public Player() {
    }

    public Player(int idPlayer, String name) {
        this.idPlayer = idPlayer;
        this.name = name;
    }
    
    public Guess newGuess(Guess guess){
        return guess;
    }

    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}