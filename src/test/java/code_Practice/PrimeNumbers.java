package code_Practice;

public class PrimeNumbers {

	public static void main(String[] args) {
	
		int a =5;
		
		boolean isPrime = true;
		
	  if(a<=1) {
		  isPrime = false;
	  }
	  else {
		  for (int i=2; i<a; i++) {
			  if(a%i==0) {
				  isPrime = false;
			  }
		  }
	  }
	  
	  if(isPrime) {
		  System.out.print(a + " " + "is a Primenumber");
		  
	  }
	  else {
		  System.out.print(a + " " + "is not a Primenumber");
	  }
		

	}

}
