package com.ll.exam.damda.controller.design.map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/search/design")
@Controller
public class PlanController {
    @GetMapping("/new")
    public String new_plan() {
        return "/design/map/new_plan3";
    }
    @GetMapping("/modification/{course_id}")
    public String modify_plan() {
        return "modifyPlan";
    }

    @PostMapping("/modification/{course_id}")
    public String modify_plan_Post() {
        return "redirect:/travel/design";
    }
    @PostMapping("/new")
    public String new_plan_Post() {
        return "redirect:/travel/design";
    }
}
