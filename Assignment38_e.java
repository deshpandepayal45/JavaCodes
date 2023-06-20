//wap which accept rows and colums from user and display below pattern
/*
h
h e
h e l
h e l l
h e l l o
h e l l
h e l
h e
h
*/

import java.util.*;
class Assignment38_e
{
    public static void printPattern(String str)
    {
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
        for(int iCnt=2;iCnt<=str.length()+1;iCnt++)
        {
            for(int jCnt=0;jCnt<=str.length();jCnt++)
            {
                if(jCnt+iCnt<=str.length()+1)
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