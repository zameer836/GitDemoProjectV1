package javaTestFolder;

public class ArmstrongNumber {
	public static void main(String[] args) {
		//152=1*1*1+5*5*5+3*3*3
		
		int number=1634,remainder,result=0;
		int temp=number;
		while (number>0) {
			remainder=number%10;
			number=number/10;
			result=result+remainder*remainder*remainder*remainder;
		}
		
		if(temp==result) {
			System.out.println("it is a armgstrong number");
		}
		else {
			System.out.println("sorry it is not a armstrong number");
		}
		
		
	}

}
