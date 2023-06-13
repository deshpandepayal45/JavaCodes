//check number is armstrong or not
import java.util.*;

class Program37{
	public static void main(String[] args)
	{
		int iValue=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :\n");
		iValue=sc.nextInt();
		int iCnt=0;
		int iRem=0;
		int iArm=0;
		int m=iValue;
		while(iValue >0)
		{
			iRem=iValue%10;
			iArm=iArm+(iRem*iRem*iRem);
			iValue=iValue/10;
			
			
		}
		
		if(iArm==m)
		{
		
		System.out.println("number is armstrong :\n");
			
		}
		else{
		System.out.println("number is not armstrong :\n");
		}
	}
	
}
				
		
