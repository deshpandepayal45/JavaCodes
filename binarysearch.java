//Searching an element in arrray
//Binary search

import java.util.*;

class Program58{
	public static void main(String[] args)
	{
		int[] a={1,2,3,4,5};
		int b[]={2,3,4,5,6};
		int aNum=4;
		int aMid=0;
		int low=0;
		int height=4;
		while(low<=height)
		{
		aMid=(a[low]+a[height])/2;
			if(a[aMid]==a[aNum])
			{
			System.out.println("No is found :\n");
			break;
			}
			else if(a[aMid]>a[aNum])
			{
				height--;
			}
			else{
			low++;
			}
			
		}
		
	}
}
