package com.spring.SpringScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
        Student s1=a.getBean("s1",Student.class);
        
        s1.setId(1);
        s1.setFname("Nikhil");
        s1.setLname("Patil");
        s1.setEmail("nikhil@gmail.com");
        
        System.out.println(s1);
        
        Student s2=a.getBean("s1",Student.class);
        
        System.out.println(s2);
    }
}
