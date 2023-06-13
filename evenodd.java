//even or odd 
import java.util.*;

class Program22{
	public static void main(String[] args)
	{
		
		
		int iValue=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		iValue=sc.nextInt();
		
		if(iValue%2==0)
		{
			System.out.println("Number is even \n");
		}
		else{
			System.out.println("Number is odd \n");
		}
	}
}
