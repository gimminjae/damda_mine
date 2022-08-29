package com.ll.exam.damda.service.design.map;

import com.ll.exam.damda.repository.design.map.PlanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlanService {
    private final PlanRepository planRepository;
}
