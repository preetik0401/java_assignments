package assignment4;

import java.util.HashMap;
import java.util.Map;

public class RepetitiveCharcters {

	public void countRepChars(String str) {	
		
		// Create a HashMap
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		// Convert the String to char array
		char[] chars = str.toCharArray();
		
		// checking each char of chars
		for (char ch : chars) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		
		 // Printing the RepcharCountMap 
		for (Map.Entry<Character,Integer> entry : map.entrySet()) { 
           // System.out.println(entry.getKey() + " " + entry.getValue()); 
            if(entry.getValue()>1){
            		System.out.println(entry.getKey());
}
        } 
		
		}
	

	public static void main(String[] args) {
		RepetitiveCharcters obj = new RepetitiveCharcters();
		System.out.println("String: AMAZON DEVELOPMENT CENTRE");
	    System.out.println("-------------------------");
	    obj.countRepChars("AMAZON DEVELOPMENT CENTRE");
	    
	  
		

	}

}
