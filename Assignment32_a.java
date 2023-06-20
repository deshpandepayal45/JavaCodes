//write a java program which accept n number from user and return difference
//between summation of even elements and summation of odd elements
import java.util.*;
class Assignment32_a{
    public static int diffOfSum(int Arr[],int size)
    {
        int EvenSum=0,oddSum=0;
        for(int iCnt=0;iCnt<size;iCnt++)
        {
            if(Arr[iCnt]%2==0)
            {a = new int[n];

        System.out.println("Enter the elements of the array:");

        for(int i = 0; i < n; i++)

        {

            a[i] = s.nextInt();

        }

        for(int i = 0; i < n; i++)

        {

            if(a[i] % 2 == 0)
                EvenSum=EvenSum+Arr[iCnt];
            }
            else{
                oddSum=oddSum+Arr[iCnt];
            }
        }
        return EvenSum-oddSum;
    }
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int Arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            Arr[i]=sc.nextInt();
        }
         for(int i=0;i<n;i++)
        {
            System.out.println(Arr[i]);
        }
        int iRet=0;
        iRet=diffOfSum(Arr,n);
        System.out.println("Difference is "+iRet);
    }

}