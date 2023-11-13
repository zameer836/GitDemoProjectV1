package javaTestFolder;

public class FibonacciSeries {
	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int res=0;
		for (int i = 0; i < 15; i++) {
			res=num1+num2;
			System.out.println(res);
			num1=num2;
			num2=res;
			
			
			
		}
	}
}
