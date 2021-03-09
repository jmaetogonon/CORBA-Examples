import Exam1App.*;
import org.omg.CORBA.*;
import org.omg.CosNaming.*;

import com.sun.xml.internal.ws.api.pipe.NextAction;

import java.util.*;

public class StartClient {
	
	public static void main(String[] args) {
		try {
	        ORB orb = ORB.init(args, null);

	        org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
	        NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
	        
	        Exam1 examObj = (Exam1) Exam1Helper.narrow(ncRef.resolve_str("EXAM"));
	        
	        	Scanner console = new Scanner(System.in);
	        	
	        	for(;;) {
	        		System.out.println("Simple Java Programs");
	        		Thread.sleep(1000);
	        		System.out.println("[1] Finding GCD of two integers");
	        		Thread.sleep(100);
	        		System.out.println("[2] Count Vowels and Consonants");
	        		Thread.sleep(100);
	        		System.out.println("[3] Palindrome");
	        		Thread.sleep(100);
	        		System.out.println("[4] Exit");
	        		Thread.sleep(100);

	        		String menu = console.nextLine();
	        	
		        		switch (menu) {
		        		
						case "1":
							System.out.println("Finding GCD of two integers");
			        		Thread.sleep(100);
							System.out.print("Enter first number: ");
			        		int num1 = console.nextInt();
			        		System.out.print("Enter second number: ");
			        		int num2 = console.nextInt();
			        		Thread.sleep(300);
				        	System.out.printf("GCD of given numbers is: %d" + "\n\n", examObj.gcd(num1, num2));
			        		Thread.sleep(1000);
							break;
							
						case "2":
							System.out.println("Count Vowels and Consonants");
							Thread.sleep(100);
							System.out.println("Enter a string:");
							Thread.sleep(300);
			        		String countString = console.nextLine();
			        		
			        		System.out.println("Number of Vowels: " + examObj.countVow(countString));
			        		System.out.println("Number of Consonants: " + examObj.countCons(countString) + "\n\n");
			        		Thread.sleep(1000);
							break;
						case "3":
			        		System.out.println("Palindrome");
							Thread.sleep(100);
							System.out.println("Enter a string/number to check if it is a palindrome:");
							Thread.sleep(300);
				        	String original = console.nextLine();
				        	System.out.println(examObj.palindrome(original) + "\n\n");
				        	Thread.sleep(1000);
							break;
						case "4":
							System.out.println("System shutting down...");
							Thread.sleep(300);
							System.exit(0);
	
						default:
							System.out.println("Please choose 1-4 only\n\n");
					}
	        	}
	        
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Client Exception: " + e);
		}
	}
}
