package javaTest2;

import java.util.Arrays;

public class ExampleProg {

	public static void main(String[] args) {
		//swapping();
		//sumOfNNumber();
		//maxArrayValue();
		//sortingArray();
		//adding2DArray();
		multiplying2DArray();
	}

	public static void swapping() {
		int a = 10;
		int b = 20;

		a = a + b;  
		b = a - b;  
		a = a - b;  

		System.out.println("a=" + a + " " + "b=" + b);
	}
	
	public static void sumOfNNumber() {
		int sum=0;
		for(int i=0;i<10;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
	
	public static void maxArrayValue() {
		//int[] array = new int[10];
		int[] array = {100,101,102,105,108,110};
		int max=array[0];
		for (int i = 1; i < array.length; i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		
		System.out.println(max);
	}
	
	public static void sortingArray() {
		int[] arr = {109,108,102,105,101,100};
		System.out.println("given array is "+ Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[i]) {
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			}
		}
		System.out.println("Sorted array is "+Arrays.toString(arr));
	}
	
	public static void adding2DArray() {
		int[][] arrayA = {
				{10,20,30},
				{20,30,40},
				{30,40,50}
		};
		
		int[][] arrayB = {
				{10,20,30},
				{20,30,40},
				{30,40,50}
		};
		
		int[][] arrayC = new int[3][3];
		
		// for adding the A and B 2D array
		for (int i = 0; i < arrayC.length; i++) {
			for (int j = 0; j < arrayC[i].length; j++) {
				arrayC[i][j] = arrayA[i][j]+arrayB[i][j];
			}
		}
		
		//for printing the arrayC in console
		for (int i = 0; i < arrayC.length; i++) {
			for (int j = 0; j < arrayC[i].length; j++) {
				System.out.print(arrayC[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void multiplying2DArray() {
		int[][] arrayA = {
				{10,20},
				{20,30}
		};
		
		int[][] arrayB = {
				{10,20},
				{20,30}
		};
		
		int[][] arrayC = new int[2][2];
		
		/* {a11,a12}    {b11,b12}   {100+400 200+600}
		 * {a21,a22}	{b21,b22}	{200+600 400+900}
		 *c11= {a11*b11+a12*b21  a11*b12+a12*b22}
		 *cij = a[i][?]*b[?][j]+a[i][k]*b[k][j]
		 */
		
		
		// for multiplying two arrays
		for (int i = 0; i < arrayC.length; i++) {
			for (int j = 0; j < arrayC[i].length; j++) {
				for (int k = 0; k < arrayC.length; k++) {
					arrayC[i][j] =arrayC[i][j]+ arrayA[i][k]*arrayB[k][j]; 
				}
			}
		}
		
		//printing result array in console
		
		  for (int i = 0; i < arrayC.length; i++) { 
			  for (int j = 0; j <arrayC[i].length; j++) { 
				  System.out.print(arrayC[i][j]+" "); 
				  }
			  	System.out.println(); }
	}

}
