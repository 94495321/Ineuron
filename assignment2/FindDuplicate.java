package arrayass;

import java.util.*;

public class FindDuplicate {
	public static void main(String[] args) {  
        //Initialize array  
        int [] arr = {2,4,3,5,2,6,6,3}; 
        for(int k = 0;k<arr.length;k++)
        {
        	System.out.print(arr[k]+",");
        	
        }
        System.out.println();
       
        System.out.println("these are the duplicate Items found below");  
        
        for(int i = 0; i < arr.length; i++) 
        {  
            for(int j = i+1; j < arr.length; j++) 
            {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }

}
