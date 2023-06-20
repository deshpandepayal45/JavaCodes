//accept array of alphabets and count capital letters
import java.util.*;
class Assignment43_c
{
    public static int countCaps(char Arr[])
    {
        int count=0,i=0;
        System.out.println(Arr.length);
        for( i=0;i<Arr.length;i++)
        {
            
            if(Arr[i]>='A'&& Arr[i]<='Z')
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=0;
        System.out.println("ENter the size of array");
        size=sc.nextInt();
        char[] arr=new char[size];
        
        for(int i=0;i<size;i++)
        {
           arr[i]=sc.next().charAt(0);
        }
        
        int iRet=0;
        iRet=countCaps(arr);
        System.out.println("Number of capital letter are :"+iRet);
    }
}