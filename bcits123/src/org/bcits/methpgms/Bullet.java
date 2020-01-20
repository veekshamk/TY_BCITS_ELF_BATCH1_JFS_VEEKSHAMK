package org.bcits.methpgms;
import java.util.Scanner;
public class Bullet 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of bullets:");
		Gun g = new Gun(sc.nextInt());
		System.out.println(g);
	}
}
