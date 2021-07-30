package io.javabrains.springbootquickstart.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        // return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
        .forEach(topics::add);
        return topics;
    }

    public Optional<Topic> getTopic(String id) {
        // return topics.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        return topicRepository.findById(id);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
     }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
} 

// private List<Topic> topics = new ArrayList<> (Arrays.asList(
//             new Topic("spring", "Spring Boot", "Spring Framework"),
//             new Topic("java", "Core Java", "Java Description"),
//             new Topic("javascript", "JavaScript", "Javascript Description")
//         ));


