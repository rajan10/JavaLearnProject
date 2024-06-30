package learnProject;

import org.w3c.dom.ls.LSException;

public class LinearSearch {

  public static void main(String[] args) {

	int[] arr = { 1, 3, 5, 7,9,11, 13, 15 };
	boolean res =lsearch(arr, 8, 4);//you pass array and key and index=0
	System.out.println(res);

  }

private static boolean lsearch(int[] arr,int n, int key)
{// TODO Auto-generated method stub	
	for (int i=0;i<n;i++) { 
		if(arr[i]==key) 
			return true;
		if(arr[i]> key)
			System.out.println("Key found at index "+i);
			return false; // this would immediately exit the function as soon as key is found
			//break;   // if you use break, it will not exit the function  but breaks the loop early if the current element is greater 
			//than the key 
	}
System.out.println("Key not found!");
return false;
}
}
		

