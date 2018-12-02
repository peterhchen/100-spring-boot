package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	// Change immutable array. Change Arrays into ArraryList. for POST Adding
	private List <Topic> topics = new ArrayList <> (Arrays.asList(
			new Topic ("Spring", "Spring Framework", "Srpign Framework Description"),
			new Topic ("Java", "Core Java", "Core Java Description"),
			new Topic ("JavaScript", "JavaScript", "JavaScript Description")
			));
	
	public List<Topic> getAllTopics () {
		return topics;
	}
	
	public Topic getTopic (String id) {
		return topics.stream().filter(t -> t.getId().equals (id)).findFirst().get();
	}
	
	public void addTop (Topic topic) {
		topics.add(topic);
	}
	// Loop through all elements, if match, then update.
	public void updateTopic (String id, Topic topic) {
		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}
	public void deleteTopic (String id) {
		topics.removeIf (t -> t.getId().equals(id));
	}
}
