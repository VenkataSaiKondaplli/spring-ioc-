package com.sai;

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
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
        InvoiceBill s1=(InvoiceBill)ctx.getBean("bill");
        s1.printStudentMarks();
    }
}
