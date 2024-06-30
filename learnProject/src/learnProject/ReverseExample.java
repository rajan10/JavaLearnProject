package learnProject;

import java.util.Scanner;

public class ReverseExample{
	
	public static void main(String[] args)
	{
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int input = sc.nextInt();
		int reverse=reverseNumFunction(input);
		System.out.println("The reverse of " +input+ " is " +reverse);
	}
	
	public static int reverseNumFunction(int number)
	{
		int reverse=0;
		while(number!=0) //123
		{
			int remainder= number%10;  // 3   2  1
					reverse= reverse*10+remainder; // 3    32   321
					number=number/10; // 12    1   0
					
		}
		return reverse;
	}
}