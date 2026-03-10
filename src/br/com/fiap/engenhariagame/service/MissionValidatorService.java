package br.com.fiap.engenhariagame.service;

import br.com.fiap.engenhariagame.domain.Mission;

public interface MissionValidatorService {
    boolean validate(Mission mission);
}
