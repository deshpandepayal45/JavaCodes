//find radix of a given number

import java.util.*;

class Program25{
	public static void main(String[] args)
	{
		
		
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		str=sc.next();
		
		
		
		if(str.matches("[01]+")==true)
		{
			System.out.println("Binary form , radix:2 \n");
		}
		else if(str.matches("[0-7]+")==true){
			System.out.println("Octal form , radix:8 \n");
		}
		else if(str.matches("[0-9]+")==true){
			System.out.println("decimal form , radix:10 \n");
		}
		
		else if(str.matches("[0-9A-F]+")==true){
			System.out.println("Hexadecimal form , radix:16 \n");
		}
		else{
		System.out.println("not a number \n");
		}
		
		
	}
}
