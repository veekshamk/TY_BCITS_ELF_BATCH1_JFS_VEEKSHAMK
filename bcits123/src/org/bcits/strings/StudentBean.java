package org.bcits.strings;
public class StudentBean 
{
public static void main(String[] args) 
{
		Student s1=new Student();
		s1.setId(10);
		s1.setName("Veeksha");
		s1.setMarks(65.7);
		
		Student s2=new Student();
		s2.setId(20);
		s2.setName("Sushmitha");
		s2.setMarks(55.5);
		
		Student s3=new Student();
		s3.setId(30);
		s3.setName("Ranjitha");
		s3.setMarks(54.5);
		
		Student s4=new Student();
		s3.setId(40);
		s3.setName("Ashritha");
		s3.setMarks(55.5);
		
		Object obj[]= {s1,s2,s3,s4};
		for (Object stu : obj) {
			System.out.println(stu);
		}
	}

}
