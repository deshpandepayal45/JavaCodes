//Check number is prime or not

import java.util.*;
class Program71{
	static int checkPrime(int iNo)
	{
		int iCnt=0;
		int flag=0;
		for(iCnt=2;iCnt<iNo/2;iCnt++)
		{
			if(iNo%iCnt!=0)
			{
			return 1;
			}
			else{
			return 0;
			}
		}
		return 1;
		
	}
	public static void main(String args[])
	{
		int iValue=0;
		System.out.println("Enter the number :\n");
		Scanner sc=new Scanner(System.in);
		iValue=sc.nextInt();
		
		iValue=checkPrime(iValue);
		if(iValue==1)
		{
		System.out.println("number is prime :\n");
		}else{
		System.out.println("number is not prime :\n");
		}
	}
}
