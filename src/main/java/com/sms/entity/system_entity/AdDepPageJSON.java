package com.sms.entity.system_entity;

import com.sms.entity.PageNumAndSize;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AdDepPageJSON extends PageNumAndSize {
    private Admin   admin;
    private Department department;
}
