//write a java program and return reverese order of that
import java.util.*;
class Assignment31_e{
    public static String Reverse(String str)
    {
        String rstr="";
        //by converting given string into character array
        //char arr[]=str.toCharArray()
        //then print it into the reverse order
        for(int iCnt=0;iCnt<str.length();iCnt++)
        {
            char ch=str.charAt(iCnt);
            rstr=ch+rstr;
        }
        return rstr;
    }


    public static void main(String[] args)
    {
        String str="\0";
        System.out.println("Enter string:");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
      
      // strRev(str);
       System.out.println( Reverse(str));
    }
}