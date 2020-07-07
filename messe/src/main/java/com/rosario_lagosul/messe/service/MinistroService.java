package com.rosario_lagosul.messe.service;

import com.rosario_lagosul.messe.entity.Ministro;

import java.util.List;
import java.util.Optional;

public interface MinistroService {


    Ministro insertMinistro(Ministro ministroObj);

    List<Ministro> findAll();

    Ministro updateMinistro(Long id,Ministro ministro);


    Ministro findMinistroById(Long id);

    void deleteById(Long id);

    Ministro save(Ministro ministro);
}
