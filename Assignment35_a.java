//wap which accepts two strings from user and concat N character of second string
//after first string.value of n should be accepted from user
 import java.util.*;
 class Assignment35_a
 {
    public static String ConcatString(String str1,String str2,int n)
    {
        int iCnt=0;
        if(n>str2.length()){
            n=str2.length();
        }
        for(iCnt=0;iCnt<n;iCnt++)
        {
            char ch=str2.charAt(iCnt);
            str1=str1+ch;
        }
        return str1;
    }
    public static void main(String[] args)
    {
        String str1="\0",str2="\0";
        Scanner sc=new Scanner(System.in);

        System.out.println("enter two strings :");
        str1=sc.nextLine();
        str2=sc.nextLine();

        int n=0;
         System.out.println("enter the value of n :");
         n=sc.nextInt();

         String ans="\0";
         ans=ConcatString(str1,str2,n);
          System.out.println("Concatination  :"+ans);

    }
 }