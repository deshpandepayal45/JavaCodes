//make menu driven program for arithmatic operation

import java.util.*;

class Program31{
	public static void main(String[] args)
	{
		
		System.out.println("-------------------Menu for arithmatic Operation---------------------------:\n");
		System.out.println("1 .. Addition\n");
		System.out.println("2.. Subtraction \n");
		System.out.println("3..Multiplication\n");
		System.out.println("4..Division \n");
		System.out.println("5..Modulus \n");
		
		
		
		Scanner sc=new Scanner(System.in);
		int iChoice=0;
		System.out.println("Enter your choice \n");
		iChoice=sc.nextInt();
		
		int iNum1=0,iNum2=0;
		System.out.println("Enter two numbers for performing selected opeartion \n");
		iNum1=sc.nextInt();
		iNum2=sc.nextInt();
		
		
		switch(iChoice)
		{
			case 1:
				
				System.out.println("Addition of "+iNum1+" and "+iNum2+" is "+(iNum1+iNum2));
				break;
			case 2:
				System.out.println("Subtraction of "+iNum1+" and "+iNum2+" is "+(iNum1-iNum2));
				break;
			case 3:
				System.out.println("Multiplication of "+iNum1+" and "+iNum2+" is "+(iNum1*iNum2));
				break;
			case 4:
				System.out.println("Division of "+iNum1+" and "+iNum2+" is "+(iNum1/iNum2));
				break;
			case 5:
				System.out.println("Modulusof "+iNum1+" and "+iNum2+" is "+(iNum1%iNum2));
				break;
			
			
			default :
				System.out.println("Wrong choice \n");
		}
			
		}
	
}
				
				
	

