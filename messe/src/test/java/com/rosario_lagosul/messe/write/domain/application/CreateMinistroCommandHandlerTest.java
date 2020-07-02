package com.rosario_lagosul.messe.write.domain.application;

import com.rosario_lagosul.messe.write.domain.core.MinistroListAggregate;
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
        MinistroListAggregate ministroListAggregate = mock(MinistroListAggregate.class);

        //when
       CreateMinistroCommandHandler handler = new CreateMinistroCommandHandler(ministroListAggregate);
       handler.handle(command);

        //then

        verify(ministroListAggregate).create(id,name,phone,address,email,availability);
    }
}
