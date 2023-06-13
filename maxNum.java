//maximum element in an arrray


import java.util.*;

class Program59{
	public static void main(String[] args)
	{
		int[] a={1,2,15,3,4,5};
		int max=Integer.MIN_VALUE;		
		for(int x:a)
		{
			if(x>=max)
			{
			max=x;
			}
			
		}
		System.out.println("Maximum value is :"+max);
	}
}
