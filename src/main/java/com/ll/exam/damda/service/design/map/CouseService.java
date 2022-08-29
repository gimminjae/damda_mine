package com.ll.exam.damda.service.design.map;

import com.ll.exam.damda.repository.design.map.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CouseService {
    private final CourseRepository courseRepository;
}
