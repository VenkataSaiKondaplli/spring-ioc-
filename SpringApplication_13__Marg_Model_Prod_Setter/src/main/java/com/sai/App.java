package com.sai;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(JavaCofig.class);
		Product product = ac.getBean("prod", Product.class);
		product.printProductData();
	}
}
