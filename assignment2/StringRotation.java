package assignment2;

public class StringRotation {
	public boolean rotateString(String str1, String str2) {
		// Check if len of str str1 equals len of str str2
        if(str2.length()!=str1.length()) return false;
		// append str str1 to end of str2
        str2+=str2;
		// Check if the substring str1 is present in str2
        if(str2.contains(str1)) return true;
        else return false;
    }
	public static void main(String[] args) {
		{ 
	        
	        StringRotation strRotate = new StringRotation();
	        System.out.println(strRotate.rotateString("XYZ", "ZXY"));
	       
	    } 

	}

}
