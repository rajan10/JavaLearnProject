package learnProject;

public class SumOfDigitExample4 {

  public static void main(String[] args) {
    String string = "12345";
	int sum = SumOfDigit(string);
	System.out.println(sum);

  }

private static int SumOfDigit(String string){
		
	return string.chars().map(Character::getNumericValue).sum();
	}
}

