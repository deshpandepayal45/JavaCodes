//accept n numbers from user and display even and numbers divible by 5
import java.util.*;
class Assignment32_c{
    public static void evenDivideByFive(int Arr[],int size)
    {
        for(int iCnt=0;iCnt<size;iCnt++)
        {
            if(Arr[iCnt]%2==0&&Arr[iCnt]%5==0){
                System.out.println(Arr[iCnt]);
            }
        }
    }
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter the array size:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        int Arr[]=new int[n];
        System.out.println("Enter the array Elements");
        for(int iCnt=0;iCnt<n;iCnt++){
            Arr[iCnt]=sc.nextInt();
        }

        evenDivideByFive(Arr,n);
    }
}