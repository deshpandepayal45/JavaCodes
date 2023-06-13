import java.util.*;

class Rectangle{
    
    public int iLength=0,iBreadth=0;
    public double Area(){
        
        return iLength*iBreadth;
    }
    public double peripheral(){
        return 2*(iLength+iBreadth);
    }
}
class Program83{
    public static void main(String[] args){
      Rectangle r1=new Rectangle();
       double cAr=0,cPh=0;
       r1.iLength=12;
        r1.iBreadth=14;

       cAr= r1.Area();
       System.out.println("Area of a Rectangle is:\n"+cAr);
       cPh=r1.peripheral();
       System.out.println("Peripheral of a Rectangle is:\n"+cPh);
    }
}