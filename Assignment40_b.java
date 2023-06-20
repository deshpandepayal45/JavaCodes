/*
* * * #
* * # @
* # @ @
# @ @ @
 */
 class Assignment40_b
{
    public static void displayPattern(int row,int col)
    {
        
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=col;j++)
            {
                if(i+j==5)
                {
                    System.out.print("# ");
                }
                else if(i+j>5)
                {
                     System.out.print("@ ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
       
        int row=4,col=4;
        displayPattern(row,col);
    }
}
