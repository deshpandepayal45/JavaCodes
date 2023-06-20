//accept two string from user and also n from user
//and check till n that strings are equal or not
import java.util.*;
class Assignment35_c
{
    public static boolean checkEqual(String str1,String str2,int n)
    {
        int iCnt=0;
        int l1=str1.length();
        int l2=str2.length();

       
        if(l1<l2)
        {
            n=l1;
        }
        else{
            n=l2;
        }
       for(iCnt=0;iCnt<n;iCnt++)
       {
        char str1_ch=str1.charAt(iCnt);

        char str2_ch=str2.charAt(iCnt);

        if(str1_ch!=str2_ch){
            return false;
        }
        
       }
       return true;
    }
    public static void main(String[] args)
    {
        String str1="\0",str2="\0";

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two strings:");
        str1=sc.nextLine();
        str2=sc.nextLine();

        int n=0;
        System.out.println("Enter value:");
        n=sc.nextInt();

        boolean bRet=false;
        bRet=checkEqual(str1,str2,n);
        if(bRet==true)
        {
             System.out.println(" two strings are equal:");
        }
        else{
             System.out.println(" two strings are not equal:");
        }
 
    }
}