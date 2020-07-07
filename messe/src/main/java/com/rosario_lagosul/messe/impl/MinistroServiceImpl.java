package com.rosario_lagosul.messe.impl;

import com.rosario_lagosul.messe.entity.Ministro;
import com.rosario_lagosul.messe.exception.DatabaseException;
import com.rosario_lagosul.messe.exception.ResourceNotFoundException;
import com.rosario_lagosul.messe.repository.MinistroRepository;
import com.rosario_lagosul.messe.service.MinistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class MinistroServiceImpl implements MinistroService {

    @Autowired
    public MinistroRepository ministroRepository;

    public Ministro insertMinistro(Ministro ministro) {
        return ministroRepository.save(ministro);
    }

    public List<Ministro> findAll() {
        return ministroRepository.findAll();
    }


    public Ministro updateMinistro(Long id,Ministro ministro ) {
        try {
            Ministro entity = ministroRepository.getOne(id);
            updateData(entity, ministro);
            return ministroRepository.save(entity);
        } catch (EntityNotFoundException e) {
            throw new EntityNotFoundException("Ministro não identificado");
        }
    }

    @Override
    public Ministro findMinistroById(Long id) {
        Optional<Ministro> obj = ministroRepository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    @Override
    public void deleteById(Long id) {
        try{
            ministroRepository.deleteById(id);
        }catch (EmptyResultDataAccessException e){
            throw new ResourceNotFoundException(id);
        }catch (DataIntegrityViolationException e){
            throw new DatabaseException(e.getMessage());
        }
    }

    private void updateData(Ministro entity, Ministro obj) {
        entity.setName(obj.getName());
        entity.setPhone(obj.getPhone());
        entity.setEmail(obj.getEmail());
        entity.setAddress(obj.getAddress());
        entity.setAvailability(obj.isAvailability());
    }

}