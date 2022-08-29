package com.ll.exam.damda.entity.design.map;

import com.ll.exam.damda.dto.design.map.SpotDto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    @Column
    private String title;

    @Column
    private int num;

    @CreatedDate
    private LocalDateTime firstCreatedDate;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    private String firstCreator;

    private String lastModifier;

    @OneToMany(mappedBy = "plan", cascade = CascadeType.REMOVE)
    private List<Course> courseList;

//    @Column
//    private List<SpotDto> spotBusket;

//    @ManyToOne
//    private Member member;
}
