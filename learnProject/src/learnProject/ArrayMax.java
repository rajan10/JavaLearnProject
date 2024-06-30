package learnProject;

public class ArrayMax {

  public static void main(String[] args) {
  int arr[]= {-1,-2,-3,-4,-5,-6};
  
  int max=findMax(arr,6);//you pass array and size of array=5
  System.out.println(max);
  }
  private static int findMax(int[] arr, int n)
  {
	  int max=arr[0]; //choose one value as max
	  for(int i=1;i<n;i++)
	  {
		  if(arr[i]>max)
		  {
			  max=arr[i];
		  }
	  }
	  return max;
  }
}

