package com.bcits.collection;

public class Person implements Comparable<Person>{
	int age;
	String name;
	public Person(int age, String name){
		super();
		this.age=age;
		this.name=name;
	}
	
	public String toString() {
		return "Person[ age="+age+", name="+name+"]";
	}
	@override
	public int compareTo(Person o) {
		return this.age-o.age;
	}

}