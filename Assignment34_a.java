//write java program which accept n numbers from user and accept one another
//number as NO , check wheather No is present

import java.util.*;
class Assignment34_a
{
    public static boolean checkNoIsPresent(int Args[],int n,int no)
    {
        int iCnt=0,iTemp=0;
        for(iCnt=0;iCnt<n;iCnt++)
        {
            if(Args[iCnt]==no)
            {
                iTemp=1;
                break;
            }
        }
        if(iTemp==1)
        {
            return true;
        }
        else{
            return false;
        }
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

        boolean bRet=false;
        bRet=checkNoIsPresent(Arr,size,No);
        if(bRet==true)
        {
            System.out.println("Number is present in array:");
        }
        else{
             System.out.println("Number is not present in array:");
        }
    }
}