package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class topicController {
	@RequestMapping ("/topics")
	public List<Topic> getAllTopics () {
		return Arrays.asList(
				new Topic ("Spring", "Spring Framework", "Srpign Framework Description"),
				new Topic ("Java", "Core Java", "Core Java Description"),
				new Topic ("JavaScript", "JavaScript", "JavaScript Description")
				);
	}
	/*
	@RequestMapping ("/topics")
	public String getAllTopic () {
		return "All topics";
	}
	*/
		
}
