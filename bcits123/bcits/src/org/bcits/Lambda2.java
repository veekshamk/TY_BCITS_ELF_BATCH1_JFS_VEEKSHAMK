package org.bcits;
public class Lambda2 {
	
public long factorialUsingStreams(int n) {
    return LongStream.rangeClosed(1, n)
        .reduce(1, (long x, long y) -> x * y);
}
