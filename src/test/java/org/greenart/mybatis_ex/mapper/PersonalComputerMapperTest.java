package org.greenart.mybatis_ex.mapper;

import org.greenart.mybatis_ex.domain.HardwareVO;
import org.greenart.mybatis_ex.domain.PersonalComputerVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonalComputerMapperTest {

    @Autowired
    PersonalComputerMapper personalComputerMapper;

    @Test
    void selectHardwareByPc() {
        List<PersonalComputerVO> pcList = personalComputerMapper.selectHardwareByPc(1L);
        System.out.println("pcList = " + pcList);
    }
}