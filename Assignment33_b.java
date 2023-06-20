//write a program which accept number from user and return the count of odd digit
import java.util.*;
class Assignment33_b
{
    public static int getCountOfOdd(int no)
    {
        int iRem=0,Count=0;
        while(no!=0)
        {
            iRem=no%10;
            if(iRem%2!=0)
            {
                Count++;
            }
            no=no/10;
        }
        return Count;
    }
    public static void main(String[] args)
    {
        int num=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();

        int iRet=0;
        iRet=getCountOfOdd(num);
        System.out.println("Count of odd digits: "+iRet);
    }
}