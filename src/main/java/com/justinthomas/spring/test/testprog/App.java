package com.justinthomas.spring.test.testprog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/justinthomas/spring/test/testprog/beans/beans.xml");
    	
        Person person = (Person)context.getBean("person");
        person.speak();
        ((ClassPathXmlApplicationContext)context).close();
    }
}
