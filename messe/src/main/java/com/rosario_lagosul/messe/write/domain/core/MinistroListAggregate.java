package com.rosario_lagosul.messe.write.domain.core;

public class MinistroListAggregate {

    private final MinistroRepository ministroRepository;

    public MinistroListAggregate(MinistroRepository ministroRepository) {
        this.ministroRepository = ministroRepository;
    }


    public void create(int id, String name, String phone, String address, String email, boolean availability) {
        ministroRepository.create(id, name, phone, address, email, availability);
    }
}
