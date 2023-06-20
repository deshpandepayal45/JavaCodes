//return its digits addition instead of each element
//replace i=array elemnt by summation of its digit
import java.util.*;
class Assignment43_b
{
    public static void checkBool(int Arr[])
    {
        //int Ans[]=new int[Arr.length];
        for(int i=0;i<Arr.length;i++)
        {
            int temp=Arr[i];
            int sum=0,iRem=0;
            while(temp!=0)
            {
                iRem=temp%10;
                sum=sum+iRem;
                temp=temp/10;
            }
            Arr[i]=sum;
        }
      
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
        checkBool(Arr1);

         System.out.println("Array elements after summation");
        for(int i=0;i<size1;i++)
        {
            System.out.print(Arr1[i]+" ");
        }
    System.out.print(" ");
       
       
    }
}