package assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SortList {

	public static void main(String[] args) {
		//Creating a List  
				List<Integer> list = new ArrayList<Integer>();
				//Adding elements in the List  
				 list.add(1);  
				 list.add(2);  
				 list.add(3);  
				 list.add(3);  
				 list.add(56); 
				 list.add(676); 
				 list.add(34); 
				 list.add(99); 
				 Collections.sort(list);
				 System.out.println(list);
				 List<Integer> uniqueElements = new ArrayList<Integer>();
				 for (Integer numbers : list) {
					if(!uniqueElements.contains(numbers)) {
						uniqueElements.add(numbers);
					}
				}
				 System.out.println("Using iterative approach:");
					for (Integer uniqElem : uniqueElements) {
						System.out.println(uniqElem);
					}
					
					System.out.println("*******************************");
					System.out.println("Using HashSet :");
					// using HashSet but does not maintain order
					uniqueElements = new ArrayList(new HashSet(list));
					for (Integer uniqElem : uniqueElements) {
						System.out.println(uniqElem);
					}
					System.out.println("*******************************");
					System.out.println("Using LinkedHashSet :");
					// using LinkedHashSet maintaining order
					uniqueElements = new ArrayList(new LinkedHashSet(list));
					for (Integer uniqElem : uniqueElements) {
						System.out.println(uniqElem);
					}

	}

}
