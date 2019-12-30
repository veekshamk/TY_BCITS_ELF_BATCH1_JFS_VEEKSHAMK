package java;

 abstract class Vehicle {
	 int a;
	 static int b;
	 abstract void start();
	 void move() {
		 System.out.println("move");
	 }
	 static void stop() {
		 System.out.println("stop");
	 }

}
