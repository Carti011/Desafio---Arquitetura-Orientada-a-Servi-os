package br.com.fiap.engenhariagame.main;

import br.com.fiap.engenhariagame.application.GameEngine;
import br.com.fiap.engenhariagame.domain.Mission;
import br.com.fiap.engenhariagame.domain.Player;
import br.com.fiap.engenhariagame.service.AdvancedMissionValidatorService;
import br.com.fiap.engenhariagame.service.BasicMissionValidatorService;
import br.com.fiap.engenhariagame.service.BasicScoreService;
import br.com.fiap.engenhariagame.service.MissionValidatorService;
import br.com.fiap.engenhariagame.service.ScoreService;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Arthur", 0);
        ScoreService scoreService = new BasicScoreService();

        MissionValidatorService basicValidator = new BasicMissionValidatorService();
        MissionValidatorService advancedValidator = new AdvancedMissionValidatorService(basicValidator);

        Mission missaoImpar = new Mission("Missao Impar", 5);
        Mission missaoPar = new Mission("Missao Par",   4);

        System.out.println("Validador Basico");
        executar(player, missaoImpar, new GameEngine(basicValidator, scoreService));
        executar(player, missaoPar,   new GameEngine(basicValidator, scoreService));
        // ----------------------------------------------------------------------------
        System.out.println("\nValidador Avancado");
        executar(player, missaoImpar, new GameEngine(advancedValidator, scoreService));
        executar(player, missaoPar,   new GameEngine(advancedValidator, scoreService));

        System.out.println("\nScore final de " + player.getScore());
    }

    private static void executar(Player player, Mission mission, GameEngine engine) {
        boolean sucesso = engine.executeMission(player, mission);
        System.out.printf("  [%s] dificuldade= %d -> %s | score acumulado: %d %n",
                mission.getName(),
                mission.getDifficulty(),
                sucesso ? "VALIDADA" : "REJEITADA",
                player.getScore());
    }
}