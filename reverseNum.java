//reverse a number


import java.util.*;

class Program38{
	public static void main(String[] args)
	{
		int iValue=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :\n");
		iValue=sc.nextInt();
		int iCnt=0,iRev=0;
		while(iValue !=0)
		{
			iCnt=iValue%10;
			iRev=iRev*10+iCnt;
			iValue=iValue/10;
			
			
		}
		System.out.println("reverse of a number :\n"+iRev);
			
		}
	
}
				
				
	

