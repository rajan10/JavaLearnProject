package learnProject;

import java.util.Scanner;

public class PatternExample {
	
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		for (int r=1; r <=3; r++){
			for(int c=1; c<= 3; c++) 
				{
					System.out.print("*");	
				}
		System.out.println();
		}
			
		sc.close();		
	}

}