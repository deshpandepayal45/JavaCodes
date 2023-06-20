//accept array from user and check wheather aaray and their elements are palandrome or not
//concat two array's
import java.util.*;
class Assignment42_e
{
    public static boolean checkBool(int Arr[])
    {
        int Ans[]=new int[Arr.length];
        for(int i=0;i<Arr.length;i++)
        {
            int temp=Arr[i];
            int sum=0,iRem=0;
            while(temp!=0)
            {
                iRem=temp%10;
                sum=sum*10+iRem;
                temp=temp/10;
            }
            if(sum==Arr[i])
            {
                Ans[i]=Arr[i];
            }
            else{
                return false;
            }
        }
       int start=0;
       int end=Ans.length-1;
       while(start<end)
       {
        if(Arr[start++]!=Ans[end--])
        {
            return false;
        }

       }
        return true;
    }
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
        int size1=0;
        
        System.out.println("Enter the size of first array:");
        size1=sc.nextInt();

        int Arr1[]=new int[size1];
    
        System.out.println("Enter the elements of first Array:");
        for(int i=0;i<size1;i++)
        {
            Arr1[i]=sc.nextInt();
        }

       boolean bRet=false;
       bRet=checkBool(Arr1);
       if(bRet==true)
       {
        System.out.println("TRUE");
       }
       else{
        System.out.println("FALSE");
       }
    }
}