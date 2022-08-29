package com.ll.exam.damda.dto.design.map;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
public class SpotDto {
    private Long id;
    private String name;
//    private String si_do;
    private String address;
//    private String description;
}
