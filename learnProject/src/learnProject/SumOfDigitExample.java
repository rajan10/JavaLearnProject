package learnProject;

import java.util.Scanner;

public class SumOfDigitExample {

  public static void main(String[] args) { 
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Enter a number: ");
	  int number = scanner.nextInt(); //123
	  try {
		  	if(number < 0)
		  	{
		  		throw new IllegalArgumentException("Number cannot be negative");
		  	}
		  	int sumOfDigits = sumOfDigits(number);
		  	System.out.println("Sum of digits of number " + number + " is " + sumOfDigits);  
	  	 }
	  catch (IllegalArgumentException e) 
	  {
		  System.out.println(e.getMessage());
	  }
	  finally 
	  {
		  scanner.close();
	  }  										}	
private static int sumOfDigits(int number){// TODO Auto-generated method stub
	int[] digits=convertNumberToArray(number);
	int sum=0;
	for (int i=0;i<digits.length;i++)
	{
		 sum=sum+digits[i];	
	}
	return sum;
	}
private static int[] convertNumberToArray(int number){// TODO Auto-generated method stub
	String numberString = Integer.toString(number);

	int[] digits= new int[numberString.length()];
	for(int i=0;i<numberString.length();i++)
	{
		digits[i]=Integer.parseInt(numberString.substring(i,i+1));
	}
	return digits;}
}

