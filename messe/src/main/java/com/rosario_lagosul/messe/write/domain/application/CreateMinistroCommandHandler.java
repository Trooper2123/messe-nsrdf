package com.rosario_lagosul.messe.write.domain.application;

import com.rosario_lagosul.messe.write.domain.core.MinistroListAggregate;

public class CreateMinistroCommandHandler {

    private final MinistroListAggregate ministroListAggregate;

    public CreateMinistroCommandHandler(MinistroListAggregate ministroListAggregate) {
        this.ministroListAggregate = ministroListAggregate;
    }

    public void handle(CreateMinistroCommand command) {
    ministroListAggregate.create(command.getId(),
            command.getName(),
            command.getPhone(),
            command.getAddress(),
            command.getEmail(),
            command.isAvailability());
    }
}

