package com.rosario_lagosul.messe.controller;

import com.rosario_lagosul.messe.controller.model.CelebracaoRequest;
import com.rosario_lagosul.messe.entity.Celebracao;
import com.rosario_lagosul.messe.service.CelebracaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/celebracoes")
public class CelebracaoController {

    @Autowired
    private CelebracaoService celebracaoService;

    @PostMapping
    public ResponseEntity insertCelebracao(@RequestBody CelebracaoRequest celebracaoRequest) {
        Celebracao celebracaoObj = new Celebracao(celebracaoRequest.getDate(),
                celebracaoRequest.getTime());
        celebracaoObj = celebracaoService.insertCelebracao(celebracaoObj);
        return ResponseEntity.ok().body(celebracaoObj);
    }
}