package io.javabrains.springbootquickstart.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId) {
        // return topics;
        List<Course> course = new ArrayList<>();
        courseRepository.findByTopicId(topicId)
        .forEach(courses::add);
        return courses;
    }

    public Optional<Course> getCourse(String id) {
        // return topics.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        courseRepository.findByName(name);
        return courseRepository.findById(id);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
     }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
} 

// private List<Topic> topics = new ArrayList<> (Arrays.asList(
//             new Topic("spring", "Spring Boot", "Spring Framework"),
//             new Topic("java", "Core Java", "Java Description"),
//             new Topic("javascript", "JavaScript", "Javascript Description")
//         ));


