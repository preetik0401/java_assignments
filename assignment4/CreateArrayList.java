package assignment4;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayList {

	public static void main(String[] args) {
		//Creating a List  
		List<String> list = new ArrayList<String>();
		//Adding elements in the List  
		 list.add("Mango");  
		 list.add("Apple");  
		 list.add("Banana");  
		 list.add("Grapes");  
		 
		System.out.println(list.get(1));
		list.set(2, "Avacado");
		System.out.println(list.get(2));
		boolean ans= list.contains("Mango");
		System.out.println(ans);
		

	}

}
