package com.rosario_lagosul.messe.write.domain.application;

import com.rosario_lagosul.messe.write.domain.core.Ministro;
import com.rosario_lagosul.messe.write.domain.core.MinistroRepository;

public class CreateMinistroCommandHandler {

    private final MinistroRepository repository;

    public CreateMinistroCommandHandler(MinistroRepository repository) {
        this.repository = repository;
    }

    public void handle(CreateMinistroCommand command) {
        Ministro ministro = new Ministro()
                .setId(command.getId())
                .setName(command.getName())
                .setPhome(command.getPhone())
                .setEmail(command.getEmail())
                .setAddress(command.getAddress())
                .setAvailability(command.isAvailability());

        repository.create(ministro);
    }
}
