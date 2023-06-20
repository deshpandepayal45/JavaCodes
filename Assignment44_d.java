/*wap which accept array of character from user and return
difference betn frequency of cap and small letters */

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
    ArrayX(int size)
    {
        super(size);
        
    }
    int DiffOfChar()
    {
        int cap=0,small=0;
        ch=Character.toLowerCase(ch);
        for(int i=0;i<size;i++)
        {
           if(Arr[i]>='A'&&Arr[i]<='Z')
           {
            cap++;
           }
           else if(Arr[i]>='a'&&Arr[i]<='z')
           {
            small++;
           }
        }
        return cap-small;
    }
}
class Assignment44_d
{
    public static void main(String[] args)
    {
        int size=0;
       
        System.out.println("ENter the size ");
        Scanner sInput=new Scanner(System.in);
        size=sInput.nextInt();
        
        ArrayX obj=new ArrayX(size);
        obj.accept();
        obj.display();
        int iRet=0;
        iRet=obj.DiffOfChar();

        System.out.println("Differnce of capital and small character: "+iRet);
    }
}