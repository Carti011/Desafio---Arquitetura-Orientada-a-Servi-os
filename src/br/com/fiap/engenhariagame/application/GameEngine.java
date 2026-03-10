package br.com.fiap.engenhariagame.application;

import br.com.fiap.engenhariagame.domain.Mission;
import br.com.fiap.engenhariagame.domain.Player;
import br.com.fiap.engenhariagame.service.MissionValidatorService;
import br.com.fiap.engenhariagame.service.ScoreService;

public class GameEngine {

    private MissionValidatorService validador;
    private ScoreService scoreService;

    public GameEngine(MissionValidatorService validador, ScoreService scoreService) {
        this.validador = validador;
        this.scoreService = scoreService;
    }

    public Boolean executeMission(Player player, Mission mission) {

        Boolean success = validador.validate(mission);

        if (success) {
            scoreService.pontuar(player, mission);
        } else {
            scoreService.penalizar(player);
        }

        return success;
    }
}
