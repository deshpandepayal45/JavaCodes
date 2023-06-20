//wap which accept no of rows and colums from user and display patter
/*
1  2  3  4  5
6  7  8  9  10
11 12 13 14 15
*/
import java.util.*;
class Assignment36_e
{
   
    public static void printPattern(int iRow,int iCol)
    {
          int ch=1;
        for(int iCnt=0;iCnt<iRow;iCnt++)
        {
           
            for(int jCnt=0;jCnt<iCol;jCnt++)
            {
                System.out.print(ch+" ");
               ch++;
            }
             
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
