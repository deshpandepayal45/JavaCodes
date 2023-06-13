//Rotation of an arrray
//left rotation

import java.util.*;

class Program61{
	public static void main(String[] args)
	{
		int[] a={1,2,15,3,4,5};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		int temp=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
