package arrayass;

public class Arraysubset {
		static boolean isSubset(int arr1[], int arr2[], int m,
	            int n)
	{
	int k = 0;
	int l = 0;
	for (k = 0; k < n; k++) {
	for (l = 0; l < m; l++)
	if (arr2[k] == arr1[l])
	    break;
	
	
	if (l == m)
	return false;
	}
	
	return true;
	}
	
	
	public static void main(String args[])
	{
	int arr1[] = { 10,15,12,1,6,99};
	int arr2[] = { 10,12,1,99 };
	
	int m = arr1.length;
	int n = arr2.length;
	
	if (isSubset(arr1, arr2, m, n))
	System.out.print("arr2 is "
	             + "subset of arr1 ");
	else
	System.out.print("arr2[] is "
	             + "not a subset of arr1[]");
	}
}

