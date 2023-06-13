//Display Arithmatic Progression series


import java.util.*;

class Program41{
	public static void main(String[] args)
	{
		int iValue=0,iValue1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the start number and end number :\n");
		iValue=sc.nextInt();
		iValue1=sc.nextInt();
		System.out.println("enter differenc :n");
		int diff=0;
		diff=sc.nextInt();
		while(iValue<iValue1)
		{
			System.out.print(iValue+"\t");
			iValue=iValue+diff;
			
			
		}
		
			
		}
	
}
				
				
	

