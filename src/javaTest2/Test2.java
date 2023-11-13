package javaTest2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Please enter the operation type");
		String Str = obj.next();
		System.out.println("Please enter the size of inputs ");
		int n = obj.nextInt();
		int result = 0;
		for (int i = 1; i <= n; i++) {
			if (Str.equalsIgnoreCase("add")) {
				System.out.println("Enter next number");
				result = result + obj.nextInt();
			} else if (Str.equalsIgnoreCase("sub")) {
				if (i == 1) {
					System.out.println("Enter next number");
					result = obj.nextInt();
				} else {
					System.out.println("Enter next number");
					result = result - obj.nextInt();
				}
			} else if (Str.equalsIgnoreCase("multiply")) {
				System.out.println("Enter next number");
				result = result * obj.nextInt();
			} else if (Str.equalsIgnoreCase("div")) {
				if (i == 1) {
					System.out.println("Enter next number");
					result = obj.nextInt();
				} else {
					System.out.println("Enter next number");
					result = result / obj.nextInt();
				}
			} else {
				System.out.println("wrong operation entered");
			}
		}
		System.out.println("result is " + result);
		obj.close();
	}

}
