package org.greenart.mybatis_ex.domain;

import java.util.List;

public class AcademyVO {
    private Long academyId;
    private String name;
    private String address;
    private String phoneNumber;

    List<StudentVO> students;
}
