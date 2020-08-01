package assignment2;

public class MaximumOccuringCharInString {


	public static void main(String args[]) {
		String s = "javajjjj";
		int[] count = new int[256];
		
		for(int i=0;i<s.length();i++) {
			count[s.charAt(i)]++;
		}
		
		int max_index = 0;
		int maxcount = Integer.MIN_VALUE;
		for(int i=0;i<count.length;i++) {
			if(maxcount < count[i]) {
				max_index =  i;
				maxcount = count[i];
			}
		}
		char result = (char) (max_index);
		System.out.println("result = " + result);
	}

}
