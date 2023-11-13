package javaTestFolder;

public class Factorial {

	public static void main(String[] args) {
		//3!=3*2*1, 4!=24
		//result=24
		int result=1;
		for(int i=1;i<=4;i++) {
			result=result*i;
		}
		System.out.println(result);
	}

}
