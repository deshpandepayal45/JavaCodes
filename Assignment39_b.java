/*wap which accept string from user and display following pattern */
/*
h e l l o
h e l l *
h e l * *
h e * * *
h * * * *
*/
class Assignment39_b
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
    }
    public static void main(String[] args)
    {
       
        String str="Hello";
        displayPattern(str);
    }
}
