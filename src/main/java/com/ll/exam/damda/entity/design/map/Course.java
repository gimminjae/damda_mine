package com.ll.exam.damda.entity.design.map;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    @Column
    private int order;

    @CreatedDate
    private LocalDate travelDate;

    @ManyToOne
    private Plan plan;

}
