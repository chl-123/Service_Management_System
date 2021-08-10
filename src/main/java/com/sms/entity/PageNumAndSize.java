package com.sms.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PageNumAndSize {
    private Integer pageNum;
    private Integer pageSize;
}
