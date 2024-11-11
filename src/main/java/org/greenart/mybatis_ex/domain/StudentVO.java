package org.greenart.mybatis_ex.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentVO {
    private Long studentId;
    private String name;
    private String phoneNumber;
    private String email;
}

