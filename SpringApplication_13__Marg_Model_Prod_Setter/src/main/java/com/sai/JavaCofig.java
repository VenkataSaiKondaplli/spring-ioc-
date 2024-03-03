package com.sai;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaCofig {
	
	@Bean("mar")
	public Margin getMargin() {
		Margin mgOb = new Margin();
		mgOb.setMrgID(1); 
		mgOb.setMrgCode("MARGIN001"); 
		return mgOb;
	}
	
	@Bean("mod")
	public Model getModel(Margin mar) {
		Model mob = new Model();
		mob.setModelID(1); 
		mob.setModelCode("MODEL001"); 
		mob.setModelCost(1000.0);
		mob.setMgOb(mar);
		return mob;
	}
	
	@Bean("prod")
	public Product getProduct(Model mod) {
		Product prod = new Product();
		prod.setProdID(1); 
		prod.setProdName("TV"); 
		prod.setMob(mod);
		return prod;
	}
}
