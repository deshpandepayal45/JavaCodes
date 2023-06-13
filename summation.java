//find sum of  n numbers

import java.util.*;

class Program33{
	public static void main(String[] args)
	{
		int iValue=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :\n");
		iValue=sc.nextInt();
		
		int iCnt=0;
		int iSum=0;
		for(iCnt=1;iCnt<=iValue;iCnt++)
		{
			iSum=iSum+iCnt;	
		}
		System.out.println("Sum of n natural number is :"+iSum);
			
		}
	
}
				
				
	

