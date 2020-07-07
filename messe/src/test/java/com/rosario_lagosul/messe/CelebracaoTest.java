package com.rosario_lagosul.messe;

import com.rosario_lagosul.messe.entity.Celebracao;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CelebracaoTest {

    @Test
    void GIVEN_ValidData_Must_RetriveSameData() {
        //given
        Long id = 1L;
        var date = "2020-07-07";
        var time = "19:00";

        //when

        Celebracao celebracao = new Celebracao(id, date, time);

        //then
        assertThat(celebracao.getDate()).isEqualTo(date);
        assertThat(celebracao.getTime()).isEqualTo(time);
    }
}
