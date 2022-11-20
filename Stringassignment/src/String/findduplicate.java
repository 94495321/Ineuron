package String;
import java.util.Scanner;

public class findduplicate {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a any name ");
		String s1=scan.nextLine();
		char[] ch1= s1.toCharArray();
		
		System.out.print("These are the duplicate characters present in the name :");
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
				if(ch1[i]==ch1[j])
				{
					
					System.out.print(ch1[j]+" ");
					break;
				}
			}
		}

	}

}
