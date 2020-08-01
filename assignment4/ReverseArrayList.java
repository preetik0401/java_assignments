package assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {
		//Creating a List  
				List<String> list = new ArrayList<String>();
				//Adding elements in the List  
				 list.add("Mango");  
				 list.add("Apple");  
				 list.add("Banana");  
				 list.add("Grapes");  
				 
				 Collections.reverse(list);
				 System.out.println(list);

	}

}
