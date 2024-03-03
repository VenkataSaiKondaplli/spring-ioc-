package com.sai;

public class Model {
	
	private int modelID;
	private String modelCode;
	private double modelCost;
	private Margin mgOb;
	
	public int getModelID() {
		return modelID;
	}
	
	public void setModelID(int modelID) {
		this.modelID = modelID;
	}
	
	public String getModelCode() {
		return modelCode;
	}
	
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}
	
	public double getModelCost() {
		return modelCost;
	}
	
	public void setModelCost(double modelCost) {
		this.modelCost = modelCost;
	}
	
	public Margin getMgOb() {
		return mgOb;
	}
	
	public void setMgOb(Margin mgOb) {
		this.mgOb = mgOb;
	}
	
	@Override
	public String toString() {
		return "Model [modelID=" + modelID + ", modelCode=" + modelCode + ", modelCost=" + modelCost + ", mgOb=" + mgOb.getMrgID() + " - " + mgOb.getMrgCode() + "]";
	}
	
	public void printModelData() {
		System.out.println("Model ID: " + modelID);
		System.out.println("Model Code: " + modelCode);
		System.out.println("Model Cost: " + modelCost);
		mgOb.PrintMarginData();
	}
}
