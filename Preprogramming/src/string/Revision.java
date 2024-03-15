package string;

import java.util.Arrays;
import java.util.Scanner;

public class Revision {
	public static void main(String[] args) {
		//average of an array
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n ");
		int n =s.nextInt();
		int[]a=new int [n];
		System.out.println("Enter the elements of an array");
		for(int i =0;i<n;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Array elements are: ");
		System.out.println(Arrays.toString(a));
		int sum=0;
		for (int i = 0; i <n; i++) {
			sum=sum+a[i];
			
		}
		System.out.println("The sum is : "+sum);
		
		double average=(double) sum/n;
		System.out.println("The average is: "+average);
		
	}
}
