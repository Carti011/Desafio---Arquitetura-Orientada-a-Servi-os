package br.com.fiap.engenhariagame.domain;

public class Mission {

    private String name;
    private int difficulty;

    public Mission(String name, int difficulty) {
        if (difficulty < 1 || difficulty > 5) {
            throw new IllegalArgumentException("Dificuldade deve ser entre 1 e 5");
        }
        this.name = name;
        this.difficulty = difficulty;
    }

    public String getName() {
        return name;
    }

    public int getDifficulty() {
        return difficulty;
    }
}
