package com.bcits.collection;

import java.util.Comparator;

public class TreeComparator implements Comparator<Person> {
	public int compare(Person o1, Person o2) {
		return o1.name.compareTo(o2.name);
	}

}
