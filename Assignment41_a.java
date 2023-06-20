/*write a java program which accept two arrays from user and display contents of each array */
import java.util.*;
class Assignment41_a
{
    public static void display(int Arr[])
    {
        for(int i=0;i<Arr.length;i++)
        {
            System.out.print(Arr[i]+" ");
        }
         System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size1=0,size2=0;
        System.out.println("enter the size of the array:");
        size1=sc.nextInt();
         System.out.println("enter the size of second array:");

        size2=sc.nextInt();

        int Arr1[]=new int[size1];
        int Arr2[]=new int[size2];

        System.out.println("enter the elements of first array:");
        for(int i=0;i<size1;i++)
        {
            Arr1[i]=sc.nextInt();
        }

        System.out.println("enter the elements of second array:");
        for(int i=0;i<size2;i++)
        {
            Arr2[i]=sc.nextInt();
        }

        display(Arr1);
        display(Arr2);

    }
}