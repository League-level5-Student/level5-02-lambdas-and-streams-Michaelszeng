package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
//		printCustomMessage((s)->{
//			for(int i = 0; i < 10; i++) {
//				System.out.println(s);
//			}
//		}, "r");
		
		printCustomMessage((s)->{
			System.out.println(s);
		}, "r");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String s2 = "";
			for (int i=13; i>=0; i--) {
				s2 += s.substring(i, i+1);
			}
			System.out.println(s2);
		}, "custon message");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String s2="";
			for (int i=0; i<9; i++) {
				if (i%2==0) {
					s2 += s.substring(i, i+1).toUpperCase();
				}
				else {
					s2 += s.substring(i, i+1);
				}
			}
			System.out.println(s2);
		}, "big words");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String s2 = "";
			for (int i=0; i<14; i++) {
				s2 += s.substring(i, i+1);
				s2 += ".";
			}
			System.out.println(s2);
		}, "custon message");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			
		}, "r");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
