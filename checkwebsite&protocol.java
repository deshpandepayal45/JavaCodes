//find the type of website and protocol is used

import java.util.*;

class Program28{
	public static void main(String[] args)
	{
		
		
		String str="http://www.udemy.com";
		int i=0;
		i=str.indexOf(":");
		String str1=str.substring(0,i);
		if(str1.equals("http")){
			System.out.println("Hyper Text Markup Language \n");
		}
		else if(str1.equals("ftp")){
			System.out.println("File transfer Protocol \n");
		}
		else{
			System.out.println("Tel Net Protocol \n");
		}
		
		int n=0;
		n=str.lastIndexOf(".");
		String str2=str.substring(n+1,str.length());
		if(str2.equals("com"))
		{
			System.out.println(" Commercial Website \n");
		}
		else if(str2.equals("gov"))
		{
			System.out.println(" goverment Website \n");
		}else
		{
			System.out.println("organizational website \n");
		}
	}
}
