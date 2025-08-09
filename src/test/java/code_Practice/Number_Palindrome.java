package code_Practice;

public class Number_Palindrome {

	public static void main(String[] args) {
		
		int a = 131;
		int rev = 0;
		int temp = a;
		
		while(temp>0) {
			int c = temp%10 ;
			rev= rev*10+c;
			temp= temp/10;
		}
		
		
		if(a==rev) {
			System.out.println("Its a Palindrome");
		}
		else {
			System.out.println("Its not a Palindrome");
		}
	}

}
