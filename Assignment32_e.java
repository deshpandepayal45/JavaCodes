//write a program which accept n numbers from user and display numbers which are multiplies of 11
import java.util.*;
class Assignment32_e{
    public static void multipliesOfEleven(int Args[],int size)
    {
        System.out.println("Numbers which are multiplies of 11:");
        int iCnt=0;
        for(iCnt=0;iCnt<size;iCnt++)
        {
            if(Args[iCnt]%11==0)
            {
                System.out.println(Args[iCnt]);
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=0;
        System.out.println("Enter the size of array");
        size=sc.nextInt();

        int Arr[]=new int[size];
        System.out.println("Enter array elements:");
        int iCnt=0;
        for(iCnt=0;iCnt<size;iCnt++)
        {
            Arr[iCnt]=sc.nextInt();
        }

        multipliesOfEleven(Arr,size);
    }
}