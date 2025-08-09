package code_Practice;

public class String_Palindrome {

	public static void main(String[] args) {
		String a = "MoM";
		
		String b = "";
		
	
		for(int i=a.length()-1; i>=0; i--) {
			
			b+=a.charAt(i); //(b=b+a.charAt(i))
				
		}
		
		if(a.equalsIgnoreCase(b)) {
			System.out.println(a + " " + "is a Palindrome");
		}
		
		else {
			
			System.out.println(a + " "+ "is not a Palindrome");
		}
	
	}

}
