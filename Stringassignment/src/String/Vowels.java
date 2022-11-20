package String;
import java.util.*;

public class Vowels {
	public static void main(String[] args)
	{
		int[] vowels= {'a','e','i','o','u'};
		int[] cons= {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
	
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a name");
		String s1=scan.nextLine();
		
		int s2=0;
		
		char[] ch1=s1.toCharArray();
		
		for(int i=0;i<vowels.length;i++)
		{
			for(int j=0;j<s1.length();j++)
			{
				if(vowels[i]==ch1[j])
				{
					System.out.print( ch1[j] +", ");
					s2++;
					
				}	
				
			}
			
		}
		System.out.println();
		System.out.println("Number of vowels : "+s2);
		System.out.println();
		
		System.out.println("Enter name");
		String a1=scan.nextLine();
		int a2=0;
		char[] ch2=a1.toCharArray();
		for(int k=0;k<cons.length;k++)
		{
			for(int l=0;l<a1.length();l++)
			{
				if(ch2[l]==cons[k])
				{
					System.out.print( ch2[l] +", ");
					a2++;
					
				}	
				
			}
			
		}
		System.out.println();
		System.out.println("Number of consonants : "+a2);
		System.out.println();
	}
	}

