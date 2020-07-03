package com.rosario_lagosul.messe.write.domain.application;

import com.rosario_lagosul.messe.write.adapter.out.MinistroRepositoryImpl;
import com.rosario_lagosul.messe.write.domain.core.Ministro;
import com.rosario_lagosul.messe.write.domain.core.MinistroRepository;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CreateMinistroCommandHandlerTest {

    @Test
    void GIVEN_ValidCommand_MUST_DelegateToListAggregate() {

        //given
        int id = 1;
        String name = "Zé";
        String phone = "(61)99999-9999";
        String address = " 456";
        String email = "teste@teste.com";
        boolean availability = false;
        CreateMinistroCommand command = new CreateMinistroCommand(id, name, phone, address, email, availability);
        MinistroRepository repository = mock(MinistroRepositoryImpl.class);

        //when
        CreateMinistroCommandHandler handler = new CreateMinistroCommandHandler(repository);
        handler.handle(command);

        //then

        verify(repository).create(any(Ministro.class));
    }
}
