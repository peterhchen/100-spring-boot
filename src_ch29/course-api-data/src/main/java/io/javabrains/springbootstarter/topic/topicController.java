package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class topicController {
	
	@Autowired
	private TopicService topicService; 
	
	@RequestMapping ("/topics")
	public List<Topic> getAllTopics () {
		return topicService.getAllTopics();
	}
	
	// "/topics/Java", "/topics/Spring"
	@RequestMapping ("/topics/{id}")
	public Optional<Topic> getTopic (@PathVariable String id) {
		// get data from business service
		return topicService.getTopic(id);
	}
	// Map this method to POST with URL "/topics".
	@RequestMapping (method=RequestMethod.POST, value = "/topics")
	public void addTopic (@RequestBody Topic topic) {
		topicService.addTop (topic);
	}
	@RequestMapping (method=RequestMethod.PUT, value = "/topics/{id}")
	public void Topic (@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopic (id, topic);
	}
	@RequestMapping (method=RequestMethod.DELETE, value = "/topics/{id}")
	public void deleteTopic (@PathVariable String id) {
		topicService.deleteTopic(id);
	}
}
