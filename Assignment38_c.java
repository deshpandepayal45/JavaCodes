//wap which accept rows and colums from user and display below pattern
/*
H
H E
H E L
H E L L
H E L L O
*/

import java.util.*;
class Assignment38_c
{
    public static void printPattern(String str)
    {
        int iCnt=0,jCnt=0;
       for(iCnt=0;iCnt<str.length();iCnt++)
       {
        for(jCnt=0;jCnt<str.length();jCnt++)
        {
            if(jCnt<=iCnt)
            {
                char ch=str.charAt(jCnt);
                System.out.print(ch+" ");
       
            }
        }
        System.out.println();
       }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str="\0";
        System.out.println("Enter String:");
        str=sc.next();

        printPattern(str);
    }
}