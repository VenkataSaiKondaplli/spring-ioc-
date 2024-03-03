package com.sai;

public class Margin {
	
	private int mrgID;
	private String mrgCode;
	public int getMrgID() {
		return mrgID;
	}
	public void setMrgID(int mrgID) {
		this.mrgID = mrgID;
	}
	public String getMrgCode() {
		return mrgCode;
	}
	public void setMrgCode(String mrgCode) {
		this.mrgCode = mrgCode;
	}
	
	public void PrintMarginData()
	{
		System.out.println(mrgID);
		System.out.println(mrgCode);
	}
	
	

}
