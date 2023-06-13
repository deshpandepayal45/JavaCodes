import java.util.*;
class Program7{
	public static void main(String args[])
	{
		int iBase=0,iHeight=0;
		int iArea=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base of traingle");
		iBase=sc.nextInt();
		System.out.println("Enter the height of traingle");
		iHeight=sc.nextInt();
		
		iArea=(iBase*iHeight)/2;
		System.out.println("Area of traingle: "+iArea);
	}
}
		
