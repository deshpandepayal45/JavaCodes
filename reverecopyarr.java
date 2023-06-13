//reverse copying an arrray


import java.util.*;

class Program66{

	public static int[] copyingArray(int arr[])
	{
		int anotherArray[]=new int[arr.length];
		int k=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			
			anotherArray[k++]=arr[i];
		}
		return anotherArray;
	}
	public static void main(String[] args)
	{
		int a[]={5,3,2,4,1,7,9,5};
		System.out.println("Before copying");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
		a=copyingArray(a);
		System.out.println("After copying");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}	
	}
}
