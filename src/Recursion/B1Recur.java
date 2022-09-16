package Recursion;

public class B1Recur {
	public static void main(String[] args) {

		message();
	}

	public static void message() {
		System.out.println("Hello World1");
		message1();
		System.out.println("klk1");
	}
	public static void message1() {
		System.out.println("Hello World2");
		message2();
		System.out.println("klk2");
	}
	public static void message2() {
		int a=10;
		int b=9;
		System.out.println("Hello World3");
		message3();
		System.out.println(a+b);
	}
	public static void message3() {
		System.out.println("Hello World4");
		message4();
		System.out.println("kla");
	}
	public static void message4() {
		System.out.println("Hello World5");

	}
}