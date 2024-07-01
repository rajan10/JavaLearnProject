package learnProject;

import javax.print.attribute.standard.MultipleDocumentHandling;

public class SumOfDigitExample1 {

  public static void main(String[] args) {
  String m="12345";
  long sum=digitStringSum(m);
  System.out.println(sum);

  }

private static long digitStringSum(String m){
	long sum=0;
	for(int i=0;i<m.length();i++ )
 {
		char ch=m.charAt(i);
		 sum=sum+ch-48;// 0+1
		
}
return sum;}
}

