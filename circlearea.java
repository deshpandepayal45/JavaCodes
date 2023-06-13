import java.util.*;

class Circle{
    
    public double cArea=0;
    public int cRad=0;
    public double cArea(){
        cArea=Math.PI*cRad*cRad;
        return cArea;
    }
    public double peripheral(){
        return 2*Math.PI*cRad;
    }
}
class Program82{
    public static void main(String[] args){
       Circle c1=new Circle();
       double cAr=0,cPh=0;
       c1.cRad=12;
       cAr= c1.cArea();
       System.out.println("Area of a circle is:\n"+cAr);
       cPh=c1.peripheral();
       System.out.println("Peripheral of a circle is:\n"+cPh);
    }
}