package com.spring.SpringInheri;

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
         ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
         Student s1=a.getBean("s2",Student.class);
         System.out.println(s1);
    }
}
