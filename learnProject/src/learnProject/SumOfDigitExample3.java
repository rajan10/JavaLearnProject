package learnProject;

public class SumOfDigitExample3 {

  public static void main(String[] args) {
   String string="1234";
   int sum=SumOfDigit(string);
   System.out.println(sum);

  }

private static int SumOfDigit(String string){
	
	int sum=0;
	for(int i=0; i<string.length();i++){
		sum=sum+Character.getNumericValue(string.charAt(i));	
	}
return sum;}
}

