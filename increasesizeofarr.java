//increasing size of an arrray


import java.util.*;

class Program67{

	public static int[] copyingArray(int arr[])
	{
		int anotherArray[]=new int[2*arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			
			anotherArray[k++]=arr[i];
		}
		
		arr=anotherArray;
		anotherArray=null;
		return arr;
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
		System.out.println(a.length);
	}
}
