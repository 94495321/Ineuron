package String;

public class Palindrome {
	  public static void main(String[] args)
	    {
		  	
	        String s1="2442";
	        String s2="";
	        
	        for(int i=s1.length()-1;i>=0;i--)
	        {
	        	s2=s2+s1.charAt(i);
	        }
	        
	        if(s1.contentEquals(s2))
	        {
	        	System.out.println("palindrome");
	        }
	        else
	        {
	        	System.out.println("Not a palindrome");
	        }
	        
	    }
	}