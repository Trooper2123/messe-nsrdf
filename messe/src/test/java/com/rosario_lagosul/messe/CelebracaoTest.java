package com.rosario_lagosul.messe;

import com.rosario_lagosul.messe.entity.Celebracao;
import com.rosario_lagosul.messe.service.CelebracaoService;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

public class CelebracaoTest {

    @Test
    void GIVEN_ValidData_Must_RetriveSameData() {
        //given
        Long id = 1L;
        String date = "07/07/2020";
        String time = "19:00";

        //when

        Celebracao celebracao = new Celebracao(id, date, time);

        //then
        assertThat(celebracao.getDate()).isEqualTo(date);
        assertThat(celebracao.getTime()).isEqualTo(time);
    }
}
