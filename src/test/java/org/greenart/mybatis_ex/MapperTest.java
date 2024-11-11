package org.greenart.mybatis_ex;

import lombok.extern.slf4j.Slf4j;
import org.greenart.mybatis_ex.mapper.TimeMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Slf4j
public class MapperTest {

    @Autowired
    TimeMapper timeMapper;

    @Test
    void test(){
        String time = timeMapper.getTiem();
        log.info(time);
    }
}
