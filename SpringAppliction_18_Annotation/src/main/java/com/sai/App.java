package com.sai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.sai")
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac=new AnnotationConfigApplicationContext(App.class);
        Employee e=ac.getBean(Employee.class);
        e.printEmployeeData();
    }
}
