package learnProject;

import java.util.Arrays;

public class SumOfDigitExample2 {

  public static void main(String[] args) {
    String m = "1234567";
	long sum = digitStringSum(m);
	System.out.println(sum);

  }
//using Arrays.stream
private static long digitStringSum(String m){
	return Arrays.stream(m.split(""))
			.mapToInt(Integer::parseInt).sum();}// method reference to static method 'pareseInt'
}

