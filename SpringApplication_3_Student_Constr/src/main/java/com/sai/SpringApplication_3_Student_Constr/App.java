package com.sai.SpringApplication_3_Student_Constr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
    	 Student student=(Student)ac.getBean("student");
         student.studentMarks();
    }
}
