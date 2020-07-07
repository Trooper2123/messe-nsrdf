package com.rosario_lagosul.messe.service;


import com.rosario_lagosul.messe.entity.Celebracao;

import java.util.List;

public interface CelebracaoService {

    Celebracao insertCelebracao(Celebracao celebracao);

    List<Celebracao> findAll();

    List<Celebracao> findByDate(String date);

    Celebracao updateCelebracao(Long id, Celebracao celebracao);

    void deleteById(Long id);
}
