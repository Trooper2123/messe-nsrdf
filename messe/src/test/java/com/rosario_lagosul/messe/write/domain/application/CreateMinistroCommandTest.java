package com.rosario_lagosul.messe.write.domain.application;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CreateMinistroCommandTest {

    @Test
    void GIVEN_ValidData_Must_RetriveSameData(){

        //given
        int id = 1;
        String name = "Zé";
        String phone = "(61)99999-9999";
        String address = " 456";
        String email = "teste@teste.com";
        boolean availability = false;

        //when
       CreateMinistroCommand command =  new CreateMinistroCommand(id,name,phone,address,email,availability);

        //then

        assertThat(command.getId()).isEqualTo(id);
        assertThat(command.getName()).isEqualTo(name);
        assertThat(command.getPhone()).isEqualTo(phone);
        assertThat(command.getAddress()).isEqualTo(address);
        assertThat(command.getEmail()).isEqualTo(email);
        assertThat(command.isAvailability()).isEqualTo(availability);

    }
}
