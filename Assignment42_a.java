//return the difference betwen summation of two arrays
import java.util.*;
class Assignment42_a
{
    public static int DiffOfSummation(int Arr1[],int Arr2[])
    {
        int sum1=0,sum2=0;
        for(int i=0;i<Arr1.length;i++)
        {
            sum1=sum1+Arr1[i];
        }
        for(int i=0;i<Arr2.length;i++)
        {
            sum2=sum2+Arr2[i];
        }
        return sum1-sum2;
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

       int iRet=0;
       iRet=DiffOfSummation(Arr1,Arr2);
       System.out.println("Differnce between the summation of Array elements: "+iRet);

       
    }
}