package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public Topic getTopic (@PathVariable String id) {
		// get data from business service
		return topicService.getTopic(id);
	}
}
