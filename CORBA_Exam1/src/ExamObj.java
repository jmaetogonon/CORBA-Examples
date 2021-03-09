import org.omg.CORBA.*;

import Exam1App.*;

public class ExamObj extends Exam1POA{
	private ORB orb;

	public void setORB(ORB orb_val) {
		orb = orb_val;
	}

	@Override
	public int gcd(int num1, int num2) {
		// TODO Auto-generated method stub
		while (num1 != num2) {
        	if(num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
		
		return num2;
	}

	
	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		orb.shutdown(false);
	}


	@Override
	public int countVow(String a) {
		// TODO Auto-generated method stub
		a = a.toLowerCase();
		int vows = 0, cons = 0;
		for(int i = 0; i < a.length(); i++) { 
			char ch = a.charAt(i); 
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { 
				vows++; 
			} 
			else if((ch >= 'a'&& ch <= 'z')) {
				cons++;
			}
		}
		return vows;
	}


	@Override
	public int countCons(String a) {
		// TODO Auto-generated method stub
		a = a.toLowerCase();
		int vows = 0, cons = 0;
		for(int i = 0; i < a.length(); i++) { 
			char ch = a.charAt(i); 
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { 
				vows++; 
			} 
			else if((ch >= 'a'&& ch <= 'z')) {
				cons++;
			}
		}
		return cons;
	}

	@Override
	public String palindrome(String original) {
		// TODO Auto-generated method stub
		String reverse="";
		String result;
		int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         result = "Entered string/number is a palindrome.";  
	      else  
	         result = "Entered string/number isn't a palindrome.";
		return result;  
	}

}
