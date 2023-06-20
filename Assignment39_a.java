/*wap which accept string from user and display following pattern */
/*
H * * * *
H E * * *
H E L * *
H E L L *
H E L L O
*/
class Assignment39_a
{
    public static void displayPattern(String str)
    {
        
        for(int i=0;i<str.length();i++)
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
