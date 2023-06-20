/*write a java program which accept array of characters from user and accept one character .Return Occurance of that character without considering its case */

import java.util.*;
class MyArray{
    protected int size=0;
    Scanner sInput=new Scanner(System.in);
    protected char Arr[];
    MyArray(int size)
    {
        this.size=size;
        Arr=new char[size];
    }
    void accept()
    {
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++)
        {
            Arr[i]=sInput.next().charAt(0);
        }
    }
    void display()
    {
        System.out.println("Array elements:");
        for(int i=0;i<size;i++)
        {
            System.out.print(Arr[i]+" ");
        }
        System.out.println();
    }
}
class ArrayX extends MyArray
{
    protected char ch='\0';
    ArrayX(int size,char ch)
    {
        super(size);
        this.ch=ch;
    }
    int OccuranceOfChar()
    {
        int count=0;
        ch=Character.toLowerCase(ch);
        for(int i=0;i<size;i++)
        {
            char c=Character.toLowerCase(Arr[i]);

            if(c==ch)
            {
                count++;
            }
        }
        return count;
    }
}
class Assignment44_c
{
    public static void main(String[] args)
    {
        int size=0;
        char ch='\0';
        System.out.println("ENter the size ");
        Scanner sInput=new Scanner(System.in);
        size=sInput.nextInt();
        System.out.println("ENter the character ");
        ch=sInput.next().charAt(0);

        ArrayX obj=new ArrayX(size,ch);
        obj.accept();
        obj.display();
        int iRet=0;
        iRet=obj.OccuranceOfChar();

        System.out.println("Occurance of character: "+iRet);
    }
}