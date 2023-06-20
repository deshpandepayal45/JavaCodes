//copy the content from one array to another and reverse the order
import java.util.*;
class Assignment42_c
{
    public static void ReverseConcatOrder(int Arr1[],int Arr2[])
    {
        int i=0;
        int Ans[]=new int[Arr1.length+Arr2.length];
        for( i=0;i<Arr1.length;i++)
        {
            Ans[i]=Arr1[i];
        }
         for(int j=0;j<Arr2.length;j++)
        {
            Ans[i++]=Arr2[j];
        }
        
        for( i=Ans.length-1;i>=0;i--)
        {
            System.out.print(Ans[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
        int size1=0,size2=0;
        
        System.out.println("Enter the size of first array:");
        size1=sc.nextInt();

        System.out.println("Enter the size of second array:");
        size2=sc.nextInt();

        int Arr1[]=new int[size1];
        int Arr2[]=new int[size2];

        System.out.println("Enter the elements of first Array:");
        for(int i=0;i<size1;i++)
        {
            Arr1[i]=sc.nextInt();
        }

        System.out.println("Enter the elements of second Array:");
        for(int i=0;i<size2;i++)
        {
            Arr2[i]=sc.nextInt();
        }

      ReverseConcatOrder(Arr1,Arr2);
    }
}