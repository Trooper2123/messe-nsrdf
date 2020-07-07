package com.rosario_lagosul.messe.repository;

import com.rosario_lagosul.messe.entity.Celebracao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CelebracaoRepository extends JpaRepository<Celebracao, Long> {

    @Query("select c from Celebracao c where c.date = ?1")
    List<Celebracao> findByDate(String date);
}
