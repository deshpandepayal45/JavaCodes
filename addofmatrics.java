//Adding two matrices

import java.util.*;

class Program68{

	public static int[][] additionOfMatrix(int a1[][],int a2[][])
	{
		int ans[][]=new int[3][3];
		for(int i=0;i<a2.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
			ans[i][j]=a1[i][j]+a2[i][j];
			}
		}
		return ans;
	}

	public static void main(String args[])
	{
		int mat1[][]=new int[3][3];
		int mat2[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements of first matrix");
		for(int i=0;i<mat1.length;i++)
		{
			for(int j=0;j<mat1[0].length;j++)
			{
				mat1[i][j]=sc.nextInt();
			}
		}
		
		
		System.out.println("Enter elements of second matrix");
		for(int i=0;i<mat2.length;i++)
		{
			for(int j=0;j<mat2[0].length;j++)
			{
				mat2[i][j]=sc.nextInt();
			}
		}
		
		mat1=additionOfMatrix(mat1,mat2);
		
		System.out.println("Addition of matrix");
		for(int i=0;i<mat1.length;i++)
		{
			for(int j=0;j<mat1[0].length;j++)
			{
				System.out.print(mat1[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
