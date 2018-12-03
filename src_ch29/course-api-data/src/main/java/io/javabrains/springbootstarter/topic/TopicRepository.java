package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

// Spring JSP come with this "CrudRepository" require type
public interface TopicRepository extends CrudRepository <Topic, String> {

	
}
/* You do not need to do this. Spring Data JPA does for you.
public class TopicRepository {
	// getAllTopic()
	// getTopic(String id)
	// updateTopic(Topic t)
	// deleteTopic (String id)
}
*/