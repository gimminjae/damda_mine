package com.ll.exam.damda.repository.design.map;

import com.ll.exam.damda.entity.design.map.Plan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Long> {
}