package com.rosario_lagosul.messe.write.domain.core;

import java.util.Optional;

public interface MinistroRepository {

    void create(int id, String name, String phone, String address, String email, boolean availability);

     Optional<MinistroListAggregate> findById(int id);
}