package assignment2;

public class RemoveDuplicatesFrmString {
	public String removeDuplicates(String input){
	    String result = "";
	    for (int i = 0; i < input.length(); i++) {
	        if(!result.contains(String.valueOf(input.charAt(i)))) {
	            result += String.valueOf(input.charAt(i));
	        }
	    }
	    return result;
	}
	public static void main(String[] args) {
		RemoveDuplicatesFrmString remDup= new RemoveDuplicatesFrmString();
		System.out.println(remDup.removeDuplicates("aabbccdefatafaz"));

	}

}
