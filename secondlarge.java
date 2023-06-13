//second largest element in an arrray


import java.util.*;

class Program60{
	public static void main(String[] args)
	{
		int[] a={1,2,15,3,4,5};
		int secondLarge=0;
		int max1=a[0];
		int max2=a[0];
		
		for(int x:a)
		{
			if(max1<x){
			max2=max1;
			max1=x;
			}
			else if(max2<x){
			max2=x;
			}
		}
		
		System.out.println("Maximum value is :"+max2);
	}
}
