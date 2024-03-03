package com.sai.SpringApplication_3_Student_Constr;

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
		public Student(int id, String name, String course, double fee, int subject1Marks, int subject2Marks,
				int subject3Marks, int subject4Marks, int subject5Marks) 
		{
			super();
			this.id = id;
			this.name = name;
			this.course = course;
			this.fee = fee;
			this.subject1Marks = subject1Marks;
			this.subject2Marks = subject2Marks;
			this.subject3Marks = subject3Marks;
			this.subject4Marks = subject4Marks;
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


