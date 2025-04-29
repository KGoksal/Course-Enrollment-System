package welcome_page.demo.controller;

import welcome_page.demo.model.Course;
import welcome_page.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")  // Base path for all API endpoints
public class HelloController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return courseService.getAllCourses();  
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        courseService.saveCourse(course);  
        return course;
    }
}