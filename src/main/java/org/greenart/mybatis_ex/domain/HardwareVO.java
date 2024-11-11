package org.greenart.mybatis_ex.domain;

import lombok.ToString;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HardwareVO {
    private Long hardwareId;
    private Long pcId;
    private String name;
    private Long price;
    private LocalDateTime buyDate;
}
