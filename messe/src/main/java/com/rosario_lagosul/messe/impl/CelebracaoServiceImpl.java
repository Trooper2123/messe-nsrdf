package com.rosario_lagosul.messe.impl;

import com.rosario_lagosul.messe.entity.Celebracao;
import com.rosario_lagosul.messe.exception.DatabaseException;
import com.rosario_lagosul.messe.exception.ResourceNotFoundException;
import com.rosario_lagosul.messe.repository.CelebracaoRepository;
import com.rosario_lagosul.messe.service.CelebracaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class CelebracaoServiceImpl implements CelebracaoService {

    @Autowired
    private CelebracaoRepository celebracaoRepository;

    @Override
    public Celebracao insertCelebracao(Celebracao celebracao) {
        return celebracaoRepository.save(celebracao);
    }

    @Override
    public List<Celebracao> findAll(){return celebracaoRepository.findAll(); }

    @Override
    public List<Celebracao> findByDate(String date) { return celebracaoRepository.findByDate(date);
    }

    @Override
    public Celebracao updateCelebracao(Long id, Celebracao celebracao) {
        try{
            Celebracao entity = celebracaoRepository.getOne(id);
            updateData(entity,celebracao);
            return celebracaoRepository.save(entity);
        }catch (EntityNotFoundException e){
            throw new EntityNotFoundException("Celebração não identificada ");
        }
    }

    @Override
    public void deleteById(Long id) {
        try{
            celebracaoRepository.deleteById(id);
        }catch (EmptyResultDataAccessException e){
            throw new ResourceNotFoundException(id);
        }catch (DataIntegrityViolationException e){
            throw new DatabaseException(e.getMessage());
        }
    }

    private void updateData(Celebracao entity, Celebracao obj){
        entity.setTime(obj.getTime());
        entity.setDate(obj.getDate());
    }
}
