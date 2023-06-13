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
class Cylinder extends Circle{
    int height=0;
    public double Volume(int h){
        height=h;
        return cArea()*h;
    }
}
class Program90{
    public static void main(String[] args){
       Cylinder c=new Cylinder();
       c.cRad=5;
       c.height=3;
       
       System.out.println("Area of a circle is:\n"+c.cArea());
      
       System.out.println("volume of a cylinder is:\n"+c.Volume(4));
    }
}