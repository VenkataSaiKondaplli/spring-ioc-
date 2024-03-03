package com.sai;

public class Student {
    private int id;
    private String name;
    private String course;
    private double fee;
    private int subject1Marks;
    private int subject2Marks;
    private int subject3Marks;
    private int subject4Marks;
    private int subject5Marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public int getSubject1Marks() {
		return subject1Marks;
	}
	public void setSubject1Marks(int subject1Marks) {
		this.subject1Marks = subject1Marks;
	}
	public int getSubject2Marks() {
		return subject2Marks;
	}
	public void setSubject2Marks(int subject2Marks) {
		this.subject2Marks = subject2Marks;
	}
	public int getSubject3Marks() {
		return subject3Marks;
	}
	public void setSubject3Marks(int subject3Marks) {
		this.subject3Marks = subject3Marks;
	}
	public int getSubject4Marks() {
		return subject4Marks;
	}
	public void setSubject4Marks(int subject4Marks) {
		this.subject4Marks = subject4Marks;
	}
	public int getSubject5Marks() {
		return subject5Marks;
	}
	public void setSubject5Marks(int subject5Marks) {
		this.subject5Marks = subject5Marks;
	}

   public void studentMarks()  
   {
	   System.out.println("id is "+ id);
	   System.out.println("name is "+ name);
       System.out.println("Course: " +course);
       System.out.println("Fee: " + fee);
       System.out.println("Subject 1 Marks: " + subject1Marks);
       System.out.println("Subject 2 Marks: " + subject2Marks);
       System.out.println("Subject 3 Marks: " + subject3Marks);
       System.out.println("Subject 4 Marks: " + subject4Marks);
       System.out.println("Subject 5 Marks: " + subject5Marks);
	   
	   
	   int total=subject1Marks+subject2Marks+subject3Marks+subject4Marks+subject5Marks;
       double marks=total/5;
	   if(marks > 100)
		{
			System.err.println("input error.. Your marks only been <= 100...!");
			
		}else
		{
			
		if(marks>=80)
		{
			System.out.println("A+ grade");
		}
		else if(marks>=60 && marks<=80 )
		{
			System.out.println("B+ grade");
		}
		
		else if(marks >=35 && marks <=60)
		{
			System.out.println("C garde");
		}
		else
		{
			System.out.println("Fail");
		}
	} 
   }
   
}
