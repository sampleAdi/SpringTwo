package com.example.Spring;

import com.example.Spring.component.Demobean;
import com.example.Spring.component.EmployeeBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
	public static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		logger.debug("Welcome to Spring Concept Demo");
		ApplicationContext context = SpringApplication.run(Application.class, args);
		logger.debug("Checking Context: {}", context.getBean(Demobean.class));
		logger.debug("\n** Example Using @Autowire annotation on property **");
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(104);
		employeeBean.setEname("Spring Framework Guru");
		employeeBean.showEmployeeDetails();
	}
}