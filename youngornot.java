//person is young or not
import java.util.*;

class Program23{
	public static void main(String[] args)
	{
		
		
		int iAge=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		iAge=sc.nextInt();
		
		if(iAge>=14 && iAge<=55)
		{
			System.out.println("Young\n");
		}
		else{
			System.out.println("Not Young\n");
		}
	}
}
