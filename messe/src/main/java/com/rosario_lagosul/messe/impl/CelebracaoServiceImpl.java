package com.rosario_lagosul.messe.impl;

import com.rosario_lagosul.messe.entity.Celebracao;
import com.rosario_lagosul.messe.repository.CelebracaoRepository;
import com.rosario_lagosul.messe.service.CelebracaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CelebracaoServiceImpl implements CelebracaoService {

    @Autowired
    private CelebracaoRepository celebracaoRepository;

    @Override
    public Celebracao insertCelebracao(Celebracao celebracao) {
        return celebracaoRepository.save(celebracao);
    }
}
