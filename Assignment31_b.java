//Write a program which accept string from user and count small character in string/

import java.util.*;
class Assignment31_b{
    public static int countLowerCase(String str)
    {
        int iCnt=0;
        int lowerCount=0;
        for(iCnt=0;iCnt<str.length();iCnt++)
        {
            char ch=str.charAt(iCnt);
            if(ch>='a'&& ch<='z')
            {
                lowerCount++;
            }
        }
        return lowerCount;
    }
    public static void main(String[] args)
    {
        String str="\0";
        int iRet=0;
        System.out.println("Enter the string:");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        iRet=countLowerCase(str);
        System.out.println("Number of lowercase character:"+iRet);
    }
}