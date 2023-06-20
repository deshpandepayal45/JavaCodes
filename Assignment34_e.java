//write java program which accept n number from user and return product of all odd numbers

import java.util.*;
class Assignment34_e
{
    public static int getOddMul(int args[],int n)
    {
        int iCnt=0,iMul=1;
        // System.out.println("elements in range :");
        for(iCnt=0;iCnt<n;iCnt++)
        {
            if(args[iCnt]%2!=0)
            {
                iMul=iMul*args[iCnt];
            }
        }
        return iMul;
    }
    public static void main(String[] args)
    {
        int size=0,iRet=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        size=sc.nextInt();

        int Arr[]=new int[size];
        System.out.println("Enter array elements:");
        for(int iCnt=0;iCnt<size;iCnt++)
        {
            Arr[iCnt]=sc.nextInt();
        }

       iRet=getOddMul(Arr,size);
       System.out.println("Multiplication of odd elements: "+iRet);
  

    }
}   