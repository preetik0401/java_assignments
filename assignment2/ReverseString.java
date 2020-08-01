package assignment2;

public class ReverseString {

	public static void main(String[] args) {
		String test= "reverse";
		char chars[] = test.toCharArray();
		for(int i=chars.length-1;i>=0;i--){
			
			System.out.print(chars[i]);	
		}

	}

}
