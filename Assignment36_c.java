//wap which accept no of rows and colums from user and display patter
/*
A A A A A
B B B B B
C C C C c
*/
import java.util.*;
class Assignment36_c
{
    public static void printPattern(int iRow,int iCol)
    {
         char ch='A';
        for(int iCnt=0;iCnt<iRow;iCnt++)
        {
           
            for(int jCnt=0;jCnt<iCol;jCnt++)
            {
                System.out.print(ch+" ");
               
            }
             ch++;
            System.out.println();
            
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int iRow=0,iCol=0;
        System.out.println("Enter rows and columns:");
        iRow=sc.nextInt();
        iCol=sc.nextInt();

        printPattern(iRow,iCol);
    }
}
