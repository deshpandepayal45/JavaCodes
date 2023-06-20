//wap which accept rows and colums from user and display below pattern
/*
H E L L O
H E L L 
H E L 
H E 
H 
H E
H E L
H E L L
H E L L O
*/

import java.util.*;
class Assignment38_d
{
    public static void printPattern(String str)
    {
        for(int iCnt=1;iCnt<=str.length();iCnt++)
        {
            for(int jCnt=0;jCnt<str.length();jCnt++)
            {
                if(iCnt+jCnt<=str.length()+1)
                {
                    char ch=str.charAt(jCnt);
                    System.out.print(ch+" ");
                }
            }
            System.out.println();
        }
        for(int iCnt=0;iCnt<str.length();iCnt++)
        {
            for(int jCnt=0;jCnt<str.length();jCnt++)
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