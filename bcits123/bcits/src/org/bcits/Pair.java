package org.bcits;
public class Pair 
{
		   final int num;
		   final int value;

		    Pair(int num, int value) {
		        this.num = num;
		        this.value = value;
		    }
		}

		Stream<Pair> allFactorials = Stream.iterate(new Pair(1,1), x -> new Pair(x.num+1, x.value * (x.num+1)));

