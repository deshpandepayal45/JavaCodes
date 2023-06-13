//Check a number is palindrome

import java.util.*;

class Program39{
	public static void main(String[] args)
	{
		int iValue=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :\n");
		iValue=sc.nextInt();
		int iCnt=0,iRev=0,iOrg=0;
		iOrg=iValue;
		while(iValue !=0)
		{
			iCnt=iValue%10;
			iRev=iRev*10+iCnt;
			iValue=iValue/10;
			
			
		}
		if(iRev==iOrg)
		{
		System.out.println("Number is palindrome :\n"+iCnt);
		}	
		else{
		System.out.println("Number is not palindrome :\n");
		}
		}
	
}
				
				
	

