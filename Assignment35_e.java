//accept a string from user and
// return palindrome string without considering its case
import java.util.*;
class Assignment35_e
{
    public static boolean palindrome(String str)
    {
        String str1="";
        for(int iCnt=0;iCnt<str.length();iCnt++)
        {
            char ch=str.charAt(iCnt);
            str1=ch+str1;
        }
        System.out.println(str1);
        if(str1.equals(str))
        {
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str="\0";
        System.out.println("Enter string:");
        str=sc.nextLine();

       boolean ans=false;
        ans=palindrome(str);
        if(ans==true)
        {
             System.out.println("String is Palindrome:");
        }
        else{
             System.out.println("String is not Palindrome");
        }
        }
       
}