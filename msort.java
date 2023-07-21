import java.io.*;
import java.util.*;

class msort
{
	
	static int SIZE = 10;
	static void sortMat(int mat[][], int n)
	{
	
		int temp[] = new int[n * n];
		int k = 0;

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				temp[k++] = mat[i][j];
	

		Arrays.sort(temp);
		
		
		k = 0;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				mat[i][j] = temp[k++];
	}
	

	static void printMat(int mat[][], int n)
	{
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print( mat[i][j] + " ");
			System.out.println();
		}
	}
	
	public static void main(String args[])
	{
		int mat[][] = { { 1, 5, 3, 6 },
						{ 6, 4, 7, 0 },
						{ 4, 7, 0 ,5},
						{ 1, 2, 4, 1}};
		int n = 4;
	
		System.out.println("Original Matrix:");
		printMat(mat, n);
	
		sortMat(mat, n);
	
		System.out.println("Matrix After Sorting:");
		printMat(mat, n);
	
	}
}

// This code is contributed by Nikita Tiwari.
