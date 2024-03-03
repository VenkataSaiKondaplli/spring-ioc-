package com.sai;

public class InvoiceBill {

	  private int pid;
	  private String pname;
	  private double price;
	  private int quantity;
	 
	  
	  public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public void printStudentMarks()
	  {
	    System.out.println("pid:"+pid);
	    System.out.println("product name:"+pname);	   
	    System.out.println("Price:"+price);
	    System.out.println("Qunatity:"+quantity);
	    double total=price*quantity;
	    double totalInvoice=0.0;
	    double discount=0.0;
	    if(total<10000)
	    {
	     discount=total*3.0;
	    }
	    else if(total>=10000 && total<50000)
	    {
	    	 discount=total*0.15;
	    }
	    else if(total>=50000 && total<100000)
	    {
	    	 discount=total*0.25;
	    }
	    
	    totalInvoice=total-discount;
	    System.out.println("total:"+total);
	    System.out.println("discount:"+discount);
	    System.out.println("TotalInvoice:"+totalInvoice);
	    
	  }
	
}
