//write a program which accepts string from user and check 
//wheather it contains vowel or not
import java.util.*;
class Assignment31_d
{
    public static boolean checkVowel(String str)
    {
        int iCnt=0,iTemp=0;
        for(iCnt=0;iCnt<str.length();iCnt++)
        {
            char ch=str.charAt(iCnt);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                iTemp=1;
                break;
            }
        }
        if(iTemp==1)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args)
    {
        String str="\0";
        System.out.println("Enter String:");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();

        boolean bRet=false;
        bRet=checkVowel(str);
        if(bRet==true){
            System.out.println("String contains vowel");
        }
        else{
            System.out.println("String contains vowel");
        }
    }
}