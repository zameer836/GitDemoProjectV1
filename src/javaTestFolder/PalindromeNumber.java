package javaTestFolder;

public class PalindromeNumber {

	public static void main(String[] args) {
		// 121,131,234
		
		int number=122,remainder,result=0;
		int temp=number;
		while (number>0) {
			remainder=number%10;
			number=number/10;
			result=result*10+remainder;
		}
		
		if(temp==result) {
			System.out.println("it is a palindrome number");
		}
		else {
			System.out.println("Sorry it is not a palindrome number");
		}
		
	}
		
}
