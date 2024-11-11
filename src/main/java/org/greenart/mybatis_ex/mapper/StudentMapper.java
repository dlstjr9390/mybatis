package org.greenart.mybatis_ex.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.greenart.mybatis_ex.domain.StudentVO;

import java.util.List;

@Mapper
public interface StudentMapper {
    public List<StudentVO> selectMyStudent(Long academy_id);
}
