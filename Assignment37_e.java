//wap which accept rows and colums from user and display below pattern
/*
1 1 1 1 
2 2 2 2
3 3 3 3
4 4 4 4
*/

import java.util.*;
class Assignment37_e
{
    public static void printPattern(int iRow,int iCol)
    {
        int iCnt=0,jCnt=0;
        for(iCnt=1;iCnt<=iRow;iCnt++)
        {
           
            for(jCnt=1;jCnt<=iCol;jCnt++)
            {
                
                System.out.print(iCnt+" ");
                
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