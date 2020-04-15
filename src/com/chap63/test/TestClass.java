package com.chap63.test;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.chap63.dao.ActorDAO;
import com.chap63.domain.Actor;


public class TestClass {
	@Test
	public void testActor() {
		// »ñµÃSpringºËÐÄÈÝÆ÷
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		ActorDAO  actorDAO=(ActorDAO) context.getBean("actorDao");
		Actor  actor=actorDAO.getActorById(1);
		System.out.println(actor);
	}

}
