//display summation of each array

import java.util.*;
class Assignment41_e
{
    public static int Summation(int Arr[])
    {
        int sum=0;
        for(int i=0;i<Arr.length;i++)
        {
            sum=sum+Arr[i];
        }
        return sum;
    }
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
        int size1=0,size2=0;
        
        System.out.println("Enter the size of first array:");
        size1=sc.nextInt();

        System.out.println("Enter the size of second array:");
        size2=sc.nextInt();

        int Arr1[]=new int[size1];
        int Arr2[]=new int[size2];

        System.out.println("Enter the elements of first Array:");
        for(int i=0;i<size1;i++)
        {
            Arr1[i]=sc.nextInt();
        }

        System.out.println("Enter the elements of second Array:");
        for(int i=0;i<size2;i++)
        {
            Arr2[i]=sc.nextInt();
        }

       int iRet=0;
       iRet=Summation(Arr1);
       System.out.println("Summation of 1 Array elements: "+iRet);

        iRet=Summation(Arr2);
       System.out.println("Summation of 2 Array elements: "+iRet);
    
    }
}