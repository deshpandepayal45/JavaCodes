//Check GCD of 2 number

import java.util.*;
class Program72{
	static int checkGcd(int iNo1,int iNo2)
	{
		int iCnt=0;
		for(iCnt=(iNo1/2);iCnt>1;iCnt--)
		{
			if(iNo1%iCnt==0 && iNo2%iCnt==0)
			{
			return iCnt;
			}
		}
		return iCnt;
		
	}
	public static void main(String args[])
	{
		int iValue=0,iValue1=0;
		System.out.println("Enter the number :\n");
		Scanner sc=new Scanner(System.in);
		iValue=sc.nextInt();
		System.out.println("Enter the number :\n");
		iValue=sc.nextInt();
		int i=0;
		
		i=checkGcd(iValue,iValue1);
		
		System.out.println("GCD : %d\n"+i);
		
	}
}
