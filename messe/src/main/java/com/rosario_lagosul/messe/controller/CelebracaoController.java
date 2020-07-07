package com.rosario_lagosul.messe.controller;

import com.rosario_lagosul.messe.controller.model.CelebracaoRequest;
import com.rosario_lagosul.messe.entity.Celebracao;
import com.rosario_lagosul.messe.service.CelebracaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public ResponseEntity <List<Celebracao>> findAll(){
        List<Celebracao> list = celebracaoService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{date}")
    public ResponseEntity <List<Celebracao>> findByDate(@PathVariable String date){
        List<Celebracao> list = celebracaoService.findByDate(date);
        return ResponseEntity.ok().body(list);
    }

    @PutMapping(value ="/{id}")
    public ResponseEntity<Celebracao> updateCelebracao(@PathVariable Long id, @RequestBody Celebracao celebracao){
        Celebracao celebracaoObj = celebracaoService.updateCelebracao(id,celebracao);
        return ResponseEntity.ok().body(celebracaoObj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        celebracaoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}