// write a java program which accept N numbers from user and display
//all such elements which are divisible by 3 and 5
import java.util.*;
class Assignment32_d
{
    public static void divisibleByBoth(int Args[],int n)
    {
        int iCnt=0;
        System.out.println("Array elements which are divisible by 3 and 5 are:");
        for(iCnt=0;iCnt<n;iCnt++)
        {
            if(Args[iCnt]%3==0&&Args[iCnt]%5==0)
            {
                System.out.println(Args[iCnt]);
            }
        }
    }
    public static void main(String[] args)
    {
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        size=sc.nextInt();

        int Arr[]=new int[size];
        System.out.println("Enter array elements:");
        int iCnt=0;
        for(iCnt=0;iCnt<size;iCnt++)
        {
            Arr[iCnt]=sc.nextInt();
        }

        divisibleByBoth(Arr,size);
    }
}