//aacept string rom user and reverse it n toggle cases

import java.util.*;
class Assignment35_d
{
    public static String strRevToggle(String str1)
    {
        int iCnt=0;
        String ans="\0";
        for(iCnt=0;iCnt<str1.length();iCnt++)
        {
            
            if(Character.isUpperCase(str1.charAt(iCnt)))
            {
                ans=ans+Character.toLowerCase(str1.charAt(iCnt));
            }
            else 
            {
                ans=ans+Character.toUpperCase(str1.charAt(iCnt));
            }
            
        }
        return ans;
    }
    public static void main(String[] args)
    {
        String str1="\0";

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        str1=sc.nextLine();
       
        String ans="\0";
        ans=strRevToggle(str1);
        System.out.println("after toggling character case:"+ans);
 
    }
}