package assignment2;

public class MinMaxNoInArray {
	
	public int max(int a[]) {
		int max=0;
		 for (int i=0; i<a.length;i++) {
			 if(a[i]>max) {
				 max=a[i];
			 }
		 }
		 return max;
	}
	
	public int min(int a[]) {
		int min=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
	int[] a = {700,100,10,6000};
	MinMaxNoInArray minmax=new MinMaxNoInArray();
	System.out.println("Maximum value in the array is:" +minmax.max(a));
	System.out.println("Maximum value in the array is:" +minmax.min(a));
	}
}
	   

	

