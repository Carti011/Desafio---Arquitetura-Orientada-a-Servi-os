package br.com.fiap.engenhariagame.ui;

import br.com.fiap.engenhariagame.application.GameEngine;
import br.com.fiap.engenhariagame.domain.Mission;
import br.com.fiap.engenhariagame.domain.Player;

public class GameConsoleUI {

    private final Player player;
    private final GameEngine engine;

    public GameConsoleUI(Player player, GameEngine engine) {
        this.player = player;
        this.engine = engine;
    }

    public void exibirCabecalho(String nomeValidador) {
        System.out.println("\n=== " + nomeValidador + " ===");
    }

    public void executarMissao(Mission mission) {
        boolean sucesso = engine.executeMission(player, mission);
        System.out.printf("  [%s] dificuldade = %d -> %s | score acumulado: %d %n",
                mission.getName(),
                mission.getDifficulty(),
                sucesso ? "VALIDADA" : "REJEITADA",
                player.getScore());
    }

    public void exibirScoreFinal() {
        System.out.println("\nScore final de " + player.getScore());
    }
}