//Factorial of a number

import java.util.*;

class Program34{
	public static void main(String[] args)
	{
		int iValue=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :\n");
		iValue=sc.nextInt();
		
		int iCnt=0;
		int iFact=1;
		for(iCnt=1;iCnt<=iValue;iCnt++)
		{
			iFact=iFact*iCnt;
			
		}
		System.out.println("Factorial of a number is : \n"+iFact);
			
		}
	
}
				
				
	

