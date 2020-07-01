package com.rosario_lagosul.messe.write.domain.application;

import com.rosario_lagosul.messe.write.domain.core.ListAggregate;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CreateMinistroCommandHandlerTest {

    @Test
    void GIVEN_ValidCommand_MUST_DelegateToListAggregate(){

        //given
        int id = 1;
        String name = "Zé";
        String phone = "(61)99999-9999";
        String address = " 456";
        String email = "teste@teste.com";
        boolean availability = false;
        CreateMinistroCommand command =  new CreateMinistroCommand(id,name,phone,address,email,availability);
        ListAggregate listAggregate = mock(ListAggregate.class);

        //when
       CreateMinistroCommandHandler handler = new CreateMinistroCommandHandler(listAggregate);
       handler.handle(command);

        //then

        verify(listAggregate).create(id,name,phone,address,email,availability);
    }
}
