package com.sms.entity.system_entity;

import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Staff  extends Admin{



    private List<Department> department;


}
