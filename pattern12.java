

import java.util.*;

class Program55{
	public static void main(String[] args)
	{
	int jCnt=0;
	
		for(int iCnt=0;iCnt<5;iCnt++)
		{
		
			for(jCnt=0;jCnt<=(3-iCnt);jCnt++)
			{
			
			
				System.out.print(" ");
			
		
			}
			int p;
			
			for(int k=0;k<=iCnt*2;k++)
			{
			
			
				System.out.print("*");
			}
			
			
			
			
			System.out.println("");
		}
		for(int iCnt=0;iCnt<5;iCnt++)
		{
		
			for(jCnt=1;jCnt<=iCnt;jCnt++)
			{
			
			
				System.out.print(" ");
			
		
			}
			
			
			for(int k=7;k>=(iCnt*2-1);k--)
			{
			
			
				System.out.print("*");
			}
			
			
			
			
			System.out.println("");
		}
			
			
	}
	
}
				
