//wap which accept no of rows and colums from user and display patter
/*
4 4 4 4 4 
3 3 3 3 3
2 2 2 2 2
1 1 1 1 1
*/
import java.util.*;
class Assignment36_d
{
    public static void printPattern(int iRow,int iCol)
    {
        int ch=4;
        for(int iCnt=0;iCnt<iRow;iCnt++)
        {
           
            for(int jCnt=0;jCnt<iCol;jCnt++)
            {
                System.out.print(ch+" ");
               
            }
             ch--;
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
