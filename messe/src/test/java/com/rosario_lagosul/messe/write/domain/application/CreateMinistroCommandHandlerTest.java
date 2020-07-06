package com.rosario_lagosul.messe.write.domain.application;

import com.rosario_lagosul.messe.write.adapter.out.MinistroRepositoryImpl;
import com.rosario_lagosul.messe.write.domain.core.Ministro;
import com.rosario_lagosul.messe.write.domain.core.MinistroRepository;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CreateMinistroCommandHandlerTest {

    ArgumentCaptor<Ministro> captor = ArgumentCaptor.forClass(Ministro.class);
    @Test
    void GIVEN_ValidCommand_MUST_PersistSameData() {

        //given
        int id = 1;
        String name = "Zé";
        String phone = "(61)99999-9999";
        String email = "teste@teste.com";
        String address = "456";
        boolean availability = false;
        CreateMinistroCommand command = new CreateMinistroCommand(id, name, phone, address, email, availability);
        MinistroRepository repository = mock(MinistroRepositoryImpl.class);

        //when
        CreateMinistroCommandHandler handler = new CreateMinistroCommandHandler(repository);
        handler.handle(command);

        //then

        verify(repository).create(captor.capture());
        Ministro ministro = captor.getValue();
        assertThat(ministro.getId()).isEqualTo(id);
        assertThat(ministro.getName()).isEqualTo(name);
        assertThat(ministro.getPhome()).isEqualTo(phone);
        assertThat(ministro.getEmail()).isEqualTo(email);
        assertThat(ministro.getAddress()).isEqualTo(address);
        assertThat(ministro.isAvailability()).isEqualTo(availability);
    }
}
