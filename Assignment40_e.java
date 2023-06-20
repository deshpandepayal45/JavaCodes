/*
1 2 3 4 5
1 2     5
1   3   5
1     4 5
1 2 3 4 5
*/

class Assignment40_e
{
    public static void displayPattern(int row,int col)
    {
        
        for(int i=1;i<=row;i++)
        {
         
            for(int j=1;j<=col;j++)
            {
               if(j==1||j==5)
               {
                System.out.print(j+" ");
               }
              else if(i==1||i==5)
               {
                System.out.print(j+" ");
                
               }
                else if(i==j)
               {
                System.out.print(i+" ");
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
       
       int row=5,col=5;
       displayPattern(row,col);
    }
}
