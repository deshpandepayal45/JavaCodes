//Display fibnocci series
import java.util.*;

class Program43{
	public static void main(String[] args)
	{
		int iValue=0,f1,f2,f3=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the end number :\n");
		iValue=sc.nextInt();
		System.out.println("enter the strting two number :\n");
		f1=sc.nextInt();
		f2=sc.nextInt();
		System.out.print(f1+"\t"+f2+"\t");
		
		while(f3<iValue)
		{
			
			f3=f1+f2;
			
			System.out.print(f3+"\t");
			f1=f2;
			f2=f3;
			
		}
		
			
		}
	
}
				
				
	

