//overload amethod to validate name and age

import java.util.*;
class Program77{
	static boolean validate(String s)
	{
		return s.matches("[A-Za-z]+");
	
	}
	static boolean validate(int age)
	{
		return age>=5&&age<=29;
	
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String sName="";
		System.out.println("Enter the name :\n");
 		sName=sc.next();
 		System.out.println("Name is valid or not :\t"+validate(sName));
 		
 		int iAge=0;
 		System.out.println("Enter the age :\n");
 		iAge=sc.nextInt();
 		System.out.println("Age is valid or not :\t"+validate(iAge));
 		
	}
}
