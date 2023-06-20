/* 
h e l l o
h e l l *
h e l * *
h e * * *
h * * * *
H * * * *
H E * * *
H E L * *
H E L L *
H E L L O
 */

 class Assignment39_d
{
    public static void displayPattern(String str)
    {
        
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<str.length();j++)
            {
                if(i+j<=str.length()-1)
                {
                    char ch=str.charAt(j);
                    System.out.print(ch+" ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
         for(int i=1;i<str.length();i++)
        {
            for(int j=0;j<str.length();j++)
            {
                if(i>=j)
                {
                    char ch=str.charAt(j);
                    System.out.print(ch+" ");
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
       
        String str="Hello";
        displayPattern(str);
    }
}
