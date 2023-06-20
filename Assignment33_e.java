//write a program which accept number from user and return difference between
//summation of even and odd digits
import java.util.*;
class Assignment33_e{
    public static int getDiff(int no)
    {
        int iRem=0,evenCount=0,oddCount=0;
        while(no!=0)
        {
            iRem=no%10;
            if(iRem%2==0)
            {
                evenCount=evenCount+iRem;
            }
            else{
                oddCount=oddCount+iRem;
            }
            no=no/10;
        }
        return evenCount-oddCount;
    }
    public static void main(String[] args)
    {
        int num=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();

        int iRet=0;
        iRet=getDiff(num);
        System.out.println("Difference between summation of even and odd digits :"+iRet);
    }
}