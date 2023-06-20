//write java progra which accept n numner from user and accept its range
//display all elements from that range

import java.util.*;
class Assignment34_d
{
    public static void displayRange(int args[],int n,int no1,int no2)
    {
        int iCnt=0;
         System.out.println("elements in range :");
        for(iCnt=0;iCnt<n;iCnt++)
        {
            if(args[iCnt]>=no1 && args[iCnt]<=no2)
            {
                System.out.println(args[iCnt]);
            }
        }
        
    }
    public static void main(String[] args)
    {
        int size=0,No1=0,No2=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        size=sc.nextInt();

        int Arr[]=new int[size];
        System.out.println("Enter array elements:");
        for(int iCnt=0;iCnt<size;iCnt++)
        {
            Arr[iCnt]=sc.nextInt();
        }

        System.out.println("Enter the nange:");
        No1=sc.nextInt();
        No2=sc.nextInt();

        displayRange(Arr,size,No1,No2);
    }
}   