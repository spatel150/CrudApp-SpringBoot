package io.javabrains.springbootquickstart.topic;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> { 
    // CourseRepository methods inherits CrudRepository methods

   public List<Course> findByTopicId(String topicId);
    // Declare the method in the interface. Only implement
    // the name of the method, for example, findByTopicId(String topicId)
    // Filter based on the object and the property of the object
    // Topic is the object, topicId is the property of the topic object
}
