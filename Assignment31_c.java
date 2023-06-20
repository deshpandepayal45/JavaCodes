//write a program which accept a string from user and return the frequency between small and upper case character
import java.util.*;
class Assignment31_c{
    public static int freqDifference(String str)
    {
        int iCnt=0;
        int lower=0;
        int upper=0;
        for(iCnt=0;iCnt<str.length();iCnt++)
        {
            char ch=str.charAt(iCnt);
            if(ch>='A'&&ch<='Z')
            {
                upper++;
            }
            else if(ch>='a'&&ch<='z'){
                lower++;
            }
        }
        return upper-lower;

    }
    public static void main(String[] args)
    {
        String str="\0";
        int iRet=0;
        System.out.println("Enter string:");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();

        iRet=freqDifference(str);
        System.out.println("Difference between frequency "+iRet);
    }
}