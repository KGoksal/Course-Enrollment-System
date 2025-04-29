package welcome_page.demo.service;

import welcome_page.demo.model.Course;
import welcome_page.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();  // Retrieve all courses from the database
    }

    public void saveCourse(Course course) {
        courseRepository.save(course);  // Save the course entity to the database
    }
}