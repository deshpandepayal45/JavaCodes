/*
* * * * * *
* # # # * * 
* # # * $ * 
* # * $ $ *
* * $ $ $ *
* * * * * *
 */
 

class Assignment40_d
{
    public static void displayPattern(int row,int col)
    {
        
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=col;j++)
            {
               if(i==1||i==6||j==1||j==6)
               {
                System.out.print("* ");
               }
              else if(i+j==7)
               {
                System.out.print("* ");
               }
                else if(i+j<7)
               {
                System.out.print("# ");
               }
                else if(i+j>7)
               {
                System.out.print("$ ");
               }
               else{
                System.out.print("  ");
               }
              
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
       
       int row=6,col=6;
       displayPattern(row,col);
    }
}
