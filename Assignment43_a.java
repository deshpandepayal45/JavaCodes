//accept array from user and check wheather aaray and their elements are palandrome or not
//concat two array's
import java.util.*;
class Assignment43_a
{
    public static int[] checkBool(int Arr[])
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
            Ans[i]=sum;
        }
       return Ans;
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

       int ans[]=new int[Arr1.length];
      ans= checkBool(Arr1);
      for(int i=0;i<Arr1.length;i++)
      {
        System.out.print(ans[i]+" ");
      }
       
    }
}