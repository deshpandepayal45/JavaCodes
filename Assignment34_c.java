//accept number of elements from user and accept one another number from
//user and return last occurance of of that no

import java.util.*;
class Assignment34_c
{
    public static int getLastOccurance(int args[],int n,int no)
    {
        int iCnt=0,iTemp=-1;
        for(iCnt=n-1;iCnt>=0;iCnt--)
        {
            if(args[iCnt]==no)
            {
                iTemp=1;
                break;
            }
        }
        if(iTemp==1){
            return iCnt;
        }
        return iTemp;
        
    }
    public static void main(String[] args)
    {
        int size=0,No=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        size=sc.nextInt();

        int Arr[]=new int[size];
        System.out.println("Enter array elements:");
        for(int iCnt=0;iCnt<size;iCnt++)
        {
            Arr[iCnt]=sc.nextInt();
        }

        System.out.println("Enter the number you want to search in array:");
        No=sc.nextInt();

        int iRet=0;
        iRet=getLastOccurance(Arr,size,No);
         System.out.println("Last Occurance of Number : "+iRet);
    }
}