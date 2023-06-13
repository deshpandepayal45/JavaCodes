/*greatest common divisior 
m=25 ,n=15
check m is greater if yes then
m=m-n=25-15=10
check m is greater than n if not then
n=n-m=15-10=5
check m is greater then 
m=m-n=10-5=5
 if both are equal then that is gcd*/
 
 import java.util.*;
 class Program73{
 
 	static int checkGcd(int iNo1,int iNo2)
 	{
 		while(iNo1!=iNo2)
 		{
 			if(iNo1>iNo2)
 			{
 				iNo1=iNo1-iNo2;
 			}
 			else{
 				iNo2=iNo2-iNo1;
 			}
 		}
 		return iNo1;
 		
 	}
 	
 	
 	public static void main(String[] args)
 	{
 		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter first number :\n");
 		int iValue1=0,iValue2=0;
 		iValue1=sc.nextInt();
 	
 		System.out.println("Enter second number :\n");
 		iValue2=sc.nextInt();
 	
 		int iAns=0;
 		iAns=checkGcd(iValue1,iValue2);
 		
 		System.out.println("greatest common divisior is:\t"+iAns);
 	}
 }
