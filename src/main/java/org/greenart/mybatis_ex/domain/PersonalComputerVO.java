package org.greenart.mybatis_ex.domain;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PersonalComputerVO {
    private Long pcId;
    private String username;
    private String usingPlace;

    List<HardwareVO> hardwareList;
}
