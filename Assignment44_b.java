/*wap which accet array of characters from user and replace
each small character with its corresponding capital charcters */

import java.util.*;
class MyArray{
    protected int size=0;
    protected char Arr[];
    Scanner sInput=new Scanner(System.in);
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
        System.out.println("Array elements are:");
        for(int i=0;i<size;i++)
        {
            System.out.print(Arr[i]+" ");
        }
    }
}
class ArrayX extends MyArray{
    ArrayX(int size)
    {
        super(size);
    }
    void replaceSmall()
    {
        for(int i=0;i<size;i++)
        {
            if(Arr[i]>='a'&&Arr[i]<='z')
            {
                Arr[i]=Character.toUpperCase(Arr[i]);
            }
        }
    }
}
 class Assignment44_b
 {
    public static void main(String[] args)
    {
        int size=0;
        System.out.println("Enter the size of the aray:");
        Scanner sInput=new Scanner(System.in);
        size=sInput.nextInt();

        ArrayX obj=new ArrayX(size);
        obj.accept();
        obj.display();
        obj.replaceSmall();
        obj.display();
    }
 }