//print sum of all elements in an array

import java.util.*;

class Program56{
	public static void main(String[] args)
	{
		int[] a={1,2,3,4,5};
		int b[]={2,3,4,5,6};
		int aSum=0;
		
		for(int x:a){
		aSum=aSum+x;
		}
		System.out.println("Summation of all array elements is :"+aSum);
		
		int bSum=0;
		for(int x:b){
		bSum=bSum+x;
		}
		System.out.println("Summation of all array elements is :"+bSum);
		
	}
}
