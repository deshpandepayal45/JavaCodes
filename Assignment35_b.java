//wap which accepts two strings from user and check they are equal or not

import java.util.*;
class Assignment35_b{
    public static boolean checkEqual(String str1,String str2)
    {
        int l1=str1.length();
        int l2=str2.length();

        if(l1!=l2)
        {
            return false;
        }
        int iCnt=0,iTemp=0;
        for(iCnt=0;iCnt<l1;iCnt++)
        {
            char str1_ch=str1.charAt(iCnt);
            char str2_ch=str2.charAt(iCnt);
            if(str1_ch!=str2_ch)
            {
                iTemp=1;
                break;
            }
        }

        if(iTemp==0)
        {
            return true;
        }
        return false;

    }
    public static void main(String[] args)
    {
        String str1="\0",str2="\0";

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two strings:");
        str1=sc.nextLine();
        str2=sc.nextLine();

        boolean bRet=false;
        bRet=checkEqual(str1,str2);
        if(bRet==true)
        {
             System.out.println(" two strings are equal:");
        }
        else{
             System.out.println(" two strings are not equal:");
        }
    }
}