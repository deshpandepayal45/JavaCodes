// write a program which accept number from user and display the count of digit which are between 3 and 7
import java.util.*;
class Assignment33_c{
    public static int displayCount(int no)
    {
        int iRem=0,Count=0;
        while(no!=0)
        {
            iRem=no%10;
            if(iRem>=3 && iRem<=7)
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
        iRet=displayCount(num);
        System.out.println("Count of digits which are lies between 3 and 7 :"+iRet);
    }
}