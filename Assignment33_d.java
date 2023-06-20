//write a program which accept number from user and display multiplication of digits
import java.util.*;
class Assignment33_d{
    public static int displayCount(int no)
    {
        int iRem=0,iMul=1;
        while(no!=0)
        {
            iRem=no%10;
           iMul=iMul*iRem;
            no=no/10;
        }
        return iMul;
    }
    public static void main(String[] args)
    {
        int num=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();

        int iRet=0;
        iRet=displayCount(num);
        System.out.println("Multiplication of all digiits :"+iRet);
    }
}