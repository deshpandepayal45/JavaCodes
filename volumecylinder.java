import java.util.*;
class Cylinder{
    public int radious=0;
    public int height=0;

    public double lidArea(){
        return (Math.PI*radious*radious);
    }
    
    public double volume(){
        return (Math.PI*radious*radious*height);
    }
}
class Program84{
    public static void main(String[] args){
        Cylinder c1=new Cylinder();
        c1.radious=5;
        c1.height=3;

    
        System.out.println("Area of cylinder is:\n"+ c1.lidArea());
        System.out.println("volume of cylinder is:\n"+ c1.volume());

    }
}