package com.sai;

public class Product {
	
	private int prodID;
	private String prodName;
	private Model mob;
	public int getProdID() {
		return prodID;
	}
	public void setProdID(int prodID) {
		this.prodID = prodID;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Model getMob() {
		return mob;
	}
	public void setMob(Model mob) {
		this.mob = mob;
	}
	
	public void printProductData() {
		System.out.println(prodID);
		System.out.println(prodName);
		mob.printModelData();
	}

}
