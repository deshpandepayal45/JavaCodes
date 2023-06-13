//Count digits of a number

import java.util.*;

class Program36{
	public static void main(String[] args)
	{
		int iValue=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :\n");
		iValue=sc.nextInt();
		int iCnt=0;
		while(iValue !=0)
		{
			System.out.println(iValue%10);
			iCnt++;
			iValue=iValue/10;
			
			
		}
		System.out.println("Digits of a number :\n"+iCnt);
			
		}
	
}
				
				
	

