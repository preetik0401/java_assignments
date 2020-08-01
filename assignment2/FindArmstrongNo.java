package assignment2;
/*A positive number is called armstrong number if it is equal to the sum of cubes of its digits
153 = (1*1*1)+(5*5*5)+(3*3*3)  
where:  
(1*1*1)=1  
(5*5*5)=125  
(3*3*3)=27  
So:  
1+125+27=153 */
public class FindArmstrongNo {

	public static void main(String[] args) {
		int no=153;
		int c=0;
		int a;
		int temp;
		temp=no;
		while(no>0) {
			a=no%10; //153%10=3, 15%10=5
			no=no/10; //153/10=15, 15/10=1
			c=c+(a*a*a);//0+(3*3*3), 27+(5*5*5)= 27+125=153
			
		}
		
		if(temp==c) {
			System.out.println("Armstrong no");
		}
		else
		{
			System.out.println("Not Armstrong no");
		}
	}

}
