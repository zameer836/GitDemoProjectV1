package javaTest2;

import java.util.Scanner;

public class SumOfFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number till sum should be displayed");
		//0 1 1 2 3 5 8 13 21 34 
		int number = sc.nextInt();
		int num1=0;
		int num2=1;
		int result=0;
		int sum=0;
		for(int i=1	;i<=number;i++) {
			
			
			num1=num2;
			num2=result;
			
			result=num1+num2;
			sum=sum+result;
		}
		System.out.println("the sum is "+sum);
		sc.close();
	}

}
