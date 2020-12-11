package LongestIncreasingSubsequence;

import java.util.Scanner;

public class LISProject {

	static int Lis(int arr[], int len) {
		int sort[] = new int[len];
		int i, j, max = 0;

		for (i = 0; i < len; i++)
			sort[i] = 1;

		for (i = 1; i < len; i++)

			for (j = 0; j < i; j++)

				if (arr[i] > arr[j] && sort[i] < sort[j] + 1)
					sort[i] = sort[j] + 1;
		
		for (i = 0; i < len; i++) 
			if (max < sort[i])
				max = sort[i];
		return max;
		
	}

	public static void main(String args[]) {
	  int arr[] =  { 27, 15, 14, 37, 26, 46, 53	, 65 };              

	
		int lengthofarray = arr.length;
		System.out.println("The length of LIS: " + Lis(arr, lengthofarray));
	}
}