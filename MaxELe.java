//find maximum element in an array

import java.util.*;
class Program74{

	static int checkMax(int arr[],int size)
	{
		int max=arr[0];
		int iCnt=0;
		for(iCnt=1;iCnt<size;iCnt++)
		{
			if(max<arr[iCnt])
			{
				max=arr[iCnt];
			}
		}
		return max;
	}
	
	
	public static void main(String[] args)
	{
		
 		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter size of array :\n");
 		int iSize=0,iValue2=0;
 		iSize=sc.nextInt();
 		
 		int arr[]=new int[iSize];
 		System.out.println("Enter array elements :\n");
 		for(int i=0;i<iSize;i++)
 		{
 			arr[i]=sc.nextInt();
 		}
 		
 		int iAns=0;
 		iAns=checkMax(arr,iSize);
 		System.out.println("Maximum element in an array is :\n"+iAns);
	}
}
