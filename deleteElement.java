//deleting an element into  arrray


import java.util.*;

class Program64{

	public static int[] removeElement(int arr[],int index)
	{
		int anotherArray[]=new int[arr.length-1];
		
		for(int i=0,k=0;i<arr.length;i++)
		{
			if(i==index){
			continue;
			}
			anotherArray[k++]=arr[i];
		}
		return anotherArray;
	}
	public static void main(String[] args)
	{
		int a[]={5,3,2,4,5};
		System.out.println("Before deletion");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		Scanner sc=new Scanner(System.in);
		int pos=0;
		System.out.println("Enter position where element to be deleted");
		pos=sc.nextInt();
		
		a=removeElement(a,pos);
		System.out.println("After deletion");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}	
	}
}
