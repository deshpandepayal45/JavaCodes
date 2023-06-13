//Cylinder
import java.util.*;
class Cylinder{
    private int radious=0;
    private int height=0;
    public void setRadious(int r){
        radious=r;
    }
    public int getRadious(){
        return radious;
    }
    public void setHeight(int h){
        height=h;
    }
    public int getHeight(){
        return height;
    }
    Cylinder(){ //Default Constructor
        radious=0;
        height=0;
    }
    Cylinder(int r){
        
         radious=r;
         height=1;
       
        
    }
    Cylinder(int r,int h){
        radious=r;
        height=h;
    }
}
class Program88{
    public static void main(String[] args){
        Cylinder c1=new Cylinder(4);
       // c1.setHeight(4);
       // c1.setRadious(12);
        System.out.println("radious :\n"+c1.getRadious());
        System.out.println("height :\n"+c1.getHeight());
    }
}