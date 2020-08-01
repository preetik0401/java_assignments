package assignment1;

public class AvgUsingArray {
	
	public static void main(String[] args) {
		int values[] = {1, 2,3, 4, 5};
		int sum = 0;
		for (int i=0;i<values.length; i++) {
			
			sum =  sum + values[i];
			//System.out.println(sum);
			
		}
		int avg = sum/values.length;
		System.out.println(avg);

	}

}
