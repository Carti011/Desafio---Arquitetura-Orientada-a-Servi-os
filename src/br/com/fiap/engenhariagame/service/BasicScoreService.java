package br.com.fiap.engenhariagame.service;

import br.com.fiap.engenhariagame.domain.Mission;
import br.com.fiap.engenhariagame.domain.Player;

public class BasicScoreService implements ScoreService {

    @Override
    public void pontuar(Player player, Mission mission) {
        player.addScore(mission.getDifficulty() * 10);
    }

    @Override
    public void penalizar(Player player) {
        player.addScore(-5);
    }
}