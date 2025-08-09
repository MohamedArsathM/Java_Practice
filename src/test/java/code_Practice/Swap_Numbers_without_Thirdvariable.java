package code_Practice;

public class Swap_Numbers_without_Thirdvariable {

	public static void main(String[] args) {
		
		int a = 3, b= 6;
		
		
		System.out.print("Before Swap : a = " +a + ", b =" +b);
		a= a+b;
		b= a-b;
		a = a-b;
		
		System.out.println();
		System.out.print("After Swap : a = " + a + ", b="+ b);
	}
	
	

}
