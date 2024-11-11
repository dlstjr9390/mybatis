package org.greenart.mybatis_ex.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.greenart.mybatis_ex.domain.HardwareVO;
import org.greenart.mybatis_ex.domain.PersonalComputerVO;

import java.util.List;

@Mapper
public interface PersonalComputerMapper {

    List<PersonalComputerVO> selectHardwareByPc(Long pc_id);

}
