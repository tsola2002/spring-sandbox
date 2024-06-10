package com.tsola2002.springsandbox;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	// running the car object
    	Vehicle obj = (Vehicle)context.getBean("vehicle");
    	obj.drive();
    }
}
