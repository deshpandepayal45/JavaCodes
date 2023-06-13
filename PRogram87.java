//constructor
import java.util.*;
class Rectangle{
    public int iBreadth=0,iLength=0;
    Rectangle(){
        iBreadth=1;
        iLength=1;
    }
    Rectangle(int l,int b){
        iLength=l;
        iBreadth=b;
    }
}
class PRogram87{
    public static void main(String[] args){
        Rectangle r1=new Rectangle(10,3);
        System.out.println("length="+r1.iLength);
        System.out.println("Breadth="+r1.iBreadth);
       
    }
}