package br.com.fiap.engenhariagame.service;

import br.com.fiap.engenhariagame.domain.Mission;

public class AdvancedMissionValidatorService implements MissionValidatorService {

    private final MissionValidatorService basicValidator;

    public AdvancedMissionValidatorService(MissionValidatorService basicValidator) {
        this.basicValidator = basicValidator;
    }

    @Override
    public boolean validate(Mission mission) {
        return mission.getDifficulty() % 2 == 0;
    }
}
