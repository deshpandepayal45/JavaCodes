//Inserting an element into  arrray


import java.util.*;

class Program63{
	public static void main(String[] args)
	{
		int a[]=new int[10];
	 a[0]=1;
	 a[1]=3;
	 a[2]=34;
	 a[3]=4;
		System.out.println("Before Insertion");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		Scanner sc=new Scanner(System.in);
		int num=0,pos=0;
		System.out.println("Enter element to be inserted");
		num=sc.nextInt();
		System.out.println("Enter position where element to be inserted");
		pos=sc.nextInt();
		
		for(int i=5;i>=pos;i--)
		{
			a[i]=a[i-1];
		}
		
		a[pos]=num;
		
		System.out.println("Aftere Insertion");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}
