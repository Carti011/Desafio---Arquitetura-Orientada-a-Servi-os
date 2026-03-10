package br.com.fiap.engenhariagame.domain;

public class Player {

    private String nome;
    private int score;

    public Player(String nome, int score) {
        this.nome = nome;
        this.score = score;
    }

    public void addScore(int points) {
        this.score += points;
    }

    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }
}
