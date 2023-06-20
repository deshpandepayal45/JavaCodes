/*write a java program which accept string from user and
count number of capital letters*/
import java.util.*;
class Assignment31_a
{
    public static int countCaps(String str)
    {
        int count=0,iCnt=0;
        for(iCnt=0;iCnt<str.length();iCnt++)
        {
            char ch=str.charAt(iCnt);
            if(ch >='A'&& ch <='Z')
            {
                count++;
            }
          
        }
        return count;
    }
    public static void main(String[] args)
    {
        String str="\0";
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        int iRet=countCaps(str);
        System.out.println("Number of Capital letters:"+iRet);
    }
}