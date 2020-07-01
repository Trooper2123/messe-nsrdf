package com.rosario_lagosul.messe.write.domain.application;

import com.rosario_lagosul.messe.write.domain.core.ListAggregate;

public class CreateMinistroCommandHandler {

    private final ListAggregate listAggregate;

    public CreateMinistroCommandHandler(ListAggregate listAggregate) {
        this.listAggregate = listAggregate;
    }

    public void handle(CreateMinistroCommand command) {
    listAggregate.create(command.getId(),
            command.getName(),
            command.getPhone(),
            command.getAddress(),
            command.getEmail(),
            command.isAvailability());
    }
}

