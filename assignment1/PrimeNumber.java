package assignment1;

public class PrimeNumber {

	public static void main(String[] args) {
		int num =13;
		boolean isPrime = true;
		for(int i=2; i<=num/2; i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
			
		}
		if(isPrime ==true) {
			System.out.println(num + " is a Prime No");
		}
		else {
			System.out.println(num + " is not a Prime No");
		}

	}

}
