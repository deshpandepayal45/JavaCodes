/*write a java program which accept two strings from user and check 
wheather first string is rotation of second string or not */

import java.util.*;
class rotation
{
    String str1="\0",str2="\0";
    rotation(String str1,String str2)
    {
        this.str1=str1;
        this.str2=str2;
    }
    void Display()
    {
        System.out.println("Strings are:");
        System.out.println(str1);
        System.out.println(str2);
    }
    bool checkEquality()
    {
        
    }
}
class Assignment45_a
{
    public static void main(String[] args)
    {
        Scanner sInput=new Scanner(System.in);
        String str1="\0",str2="\0";
        System.out.println("Enter two strings:");
        str1=sInput.next();
        str2=sInput.next();

    }
}