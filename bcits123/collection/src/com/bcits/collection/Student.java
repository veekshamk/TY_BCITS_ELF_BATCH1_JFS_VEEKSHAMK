package com.bcits.collection;

public class Student implements Comparable<Student>{
	int age;
	String name;
	public Student(int age, String name){
		super();
		this.age=age;
		this.name=name;
	}
	
	public String toString() {
		return "Student[ age="+age+", name="+name+"]";
	}
	@override
	public int compareTo(Student o) {
		return this.age-o.age;
	}

}
