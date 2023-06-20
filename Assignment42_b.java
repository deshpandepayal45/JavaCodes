//display minimun element from each array
import java.util.*;
class Assignment42_b
{
    public static int MinElement(int Arr[])
    {
        int Min=Arr[0];
        for(int i=1;i<Arr.length;i++)
        {
            if(Min>Arr[i])
            {
                Min=Arr[i];
            }
        }
        return Min;
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
       iRet=MinElement(Arr1);
       System.out.println("Minimum element from array: "+iRet);

        iRet=MinElement(Arr2);
       System.out.println("Minimum element from array: "+iRet);
    
    }
}