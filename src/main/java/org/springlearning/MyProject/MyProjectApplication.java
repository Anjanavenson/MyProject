package org.springlearning.MyProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(MyProjectApplication.class, args);   //bean of object
		Home h = context.getBean(Home.class);
		h.connect();

		Home h2 = context.getBean(Home.class);   //singleton scope - constructor will be called once only
		h2.connect();     // by default spring boot follows singleton scope if we want to call the constructor two times we should use prototype scope
	}

}
