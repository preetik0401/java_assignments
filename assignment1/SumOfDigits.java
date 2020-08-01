package assignment1;

public class SumOfDigits {
	public static void main(String[] args) {
		int num = 1234;
		int rem = 0;
		int sum = 0;
		//1234
		while(num>0) {
			rem= num%10;//4,3,2,1
			sum = sum +rem;//0+4,4+3,4+3+2,4+3+2+1
			num = num/10;//123,12,1
		}
		System.out.println(sum);
	}

}
