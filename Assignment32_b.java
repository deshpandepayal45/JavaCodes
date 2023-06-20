//accept n numbers from user and display numbers which are divisible by 5
import java.util.*;
class Assignment32_b{
    public static void divisibleByFive(int args[],int n)
    {
        int iCnt=0;
        System.out.println("Numbers divisible by 5");
        for(iCnt=0;iCnt<n;iCnt++)
        {
            if(args[iCnt]%5==0)
            {
                System.out.println(args[iCnt]+" ");
            }
        }
    }
    public static void main(String[] args)
    {
        int n;
        System.out.println("ENnter the size of array:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

       int Arr[]=new int[n];
        for(int iCnt=0;iCnt<n;iCnt++)
        {
            Arr[iCnt]=sc.nextInt();
        }
        
        divisibleByFive(Arr,n);
    }
}