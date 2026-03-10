package br.com.fiap.engenhariagame.service;

import br.com.fiap.engenhariagame.domain.Mission;
import br.com.fiap.engenhariagame.domain.Player;

public interface ScoreService {
    void pontuar(Player player, Mission mission);
    void penalizar(Player player);
}