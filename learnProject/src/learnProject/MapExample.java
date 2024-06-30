package learnProject;

//create a simple HashMap program

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("Rajan", 123);
		m.put("Rajan", 123);
		m.put("B", 122);
		System.out.println(m);
		System.out.println(m.size());
		
		Map<Employee, Integer> map = new HashMap<Employee, Integer>(); //<key, value>
		map.put(new Employee(1, "Rajan"), 123);
		map.put(new Employee(1, "Rajan"), 123);
		map.put(new Employee(1, "Rajan"), 123);
		System.out.println("+++++++++++++++++=");
		System.out.println(map.size());
		
		System.out.println(map);
		
		String s = "ABC";
		System.out.println("HashCode of String s:" +s.hashCode());
		System.out.println("=========================================");
		//hashCode and equals()
//		what if i overide one method only?
//				for other implemetion it will go to object implementation 
		//HashMap will identify duplicate using  overriding hashCode and equals() implementation
		//String class will override hashCode and equals() implementation
		
		String r= "A"; //this one is in string pool
		String r1= new String("A"); //this one is not in string pool but in heap
		
		//Hashcode of r and r1 are same but it may not point to the same location.
		// Hashcode is calcualted based on the content and hence below will not be equal
		System.out.println(r==r1);  // so not equal as "==" operator checks the memory reference is compared.
//		System.out.println(s1.hashCode());
		System.out.println(r.equals(r1));//it compares the content and not the hashcode
		
		//The hashCode() method in String class is overridden in the String class. This means that it will use the hashCode() method
		//in the String class instead of the hashCode() method in the Object class. This is because the hashCode() method in the String
		//class is defined to be the same as the hashCode() method in the Object class.
		System.out.println(r.hashCode());//it compares the content and not the hashcode //65
		System.out.println(r1.hashCode());//it compares the content and not the hashcode //65
		
		
//		System.out.println(r1.equals(r));
//		System.out.println(r1.equals(r1));
//		System.out.println(r1==r1);
//		System.out.println(r1==r);

			}
}