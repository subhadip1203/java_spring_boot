package com.subhadip.spring_part_1.courses;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
  
  @GetMapping("/courses")
  public List<Course> getAllCourses () {
    return Arrays.asList(new Course (1, "Java", "Subhadip"));
  }
}
