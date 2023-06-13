//given year is leap or not
import java.util.*;

class Program26{
	public static void main(String[] args)
	{
		
		
		int iYear=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year");
		iYear=sc.nextInt();
		
		if(iYear%4==0)
		{
			if(iYear%100==0)
			{
				if(iYear%400==0)
				{
					System.out.println("Year is leap \n");
				}
				else{
					System.out.println("Not leap year \n");
				}
			}
			else{
					System.out.println("Not leap year \n");
			}
		}
		else{
					System.out.println("Not leap year \n");
				}
	}
}
