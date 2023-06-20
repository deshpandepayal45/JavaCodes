//wap which accept rows and colums from user and display below pattern
/*
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
*/

import java.util.*;
class Assignment37_c
{
    public static void printPattern(int iRow,int iCol)
    {
        int iCnt=0,jCnt=0,iVal=0;
        for(iCnt=0;iCnt<iRow;iCnt++)
        {
            iVal=5;
            for(jCnt=0;jCnt<iCol;jCnt++)
            {
                System.out.print(iVal+" ");
                iVal--;
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