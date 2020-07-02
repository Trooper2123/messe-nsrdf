package com.rosario_lagosul.messe.write.domain.core;

import com.rosario_lagosul.messe.write.adapter.out.MinistroRepositoryImpl;
import helper.DataSourceHelper;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import  static org.assertj.core.api.Assertions.assertThat;

public class MinistroListAggregateTest extends DataSourceHelper {

    @Test
    void GIVEN_ValidData_MUST_PersistInDataBase(){
        // given
        int id = 1;
        String name = "Zé";
        String phone = "(61)99999-9999";
        String address = " 456";
        String email = "teste@teste.com";
        boolean availability = false;
        //MinistroRepository ministroRepository = mock(MinistroRepository.class);
        MinistroRepository ministroRepository = new MinistroRepositoryImpl(dataSource);




        // when

          MinistroListAggregate ministroListAggregate = new MinistroListAggregate(ministroRepository);
          ministroListAggregate.create(id,name,phone,address,email,availability);

        // then
        Optional<MinistroListAggregate> ministroListOptional = ministroRepository.findById(id);
        assertThat(ministroListOptional).isNotEmpty();
        MinistroListAggregate ministroEntity = ministroListOptional.get();
//        assertThat(ministroListOptional.getId()).isEqualTo(id);
//        assertThat(ministroListOptional.getName()).isEqualTo(name);
//        assertThat(ministroListOptional.getPhone()).isEqualTo(phone);
//        assertThat(ministroListOptional.getAddress().isEqualTo(address);
//        assertThat(ministroListOptional.getEmail()).isEqualTo(email);
//        assertThat(ministroListOptional.isAvailability()).isEqualTo(availability);

    }
}
