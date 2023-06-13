//display type of website using switch case

import java.util.*;

class Program30{
	public static void main(String[] args)
	{
		String str="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the website name :\n");
		str=sc.nextLine();
		
		int n=str.lastIndexOf(".");
		
		String str2=str.substring(n+1,str.length());
		
		
		switch(str2)
		{
			case "com":
				System.out.println("Commercial website \n");
				break;
			case "gov":
				System.out.println("goverment website  \n");
				break;
			case "net":
				System.out.println("Ntwork Website \n");
			
			default :
				System.out.println("Wrong choice \n");
		}
			
		}
	
}
				
				
	

