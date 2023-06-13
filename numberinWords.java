//Display a number in words


import java.util.*;

class Program40{
	public static void main(String[] args)
	{
		int iValue=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :\n");
		iValue=sc.nextInt();
		
		
		String str="";
		str=str.valueOf(iValue);
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			switch(ch)
			{
				case '0':
					System.out.println("Zero");
					break;
				case '1':
					System.out.println("One");
					break;
				case '2':
					System.out.println("Two");
					break;
				case '3':
					System.out.println("Three");
					break;
				case '4':
					System.out.println("Four");
					break;
				case '5':
					System.out.println("Five");
					break;
				case '6':
					System.out.println("Six");
					break;
				case '7':
					System.out.println("Seven");
					break;
				case '8':
					System.out.println("Eight");
					break;
				case '9':
					System.out.println("Nine");
					break;
			}
		}
		
		
		}
	
}
				
				
	

