//Array of objects
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
    public String toString(){
        return "Radious :\t"+radious+"\nHeighth :\t"+height;
    }
}
class Program89{
    public static void main(String[] args){
        Cylinder c[]=new Cylinder[3];
        c[0]=new Cylinder();
        c[1]=new Cylinder(3);
        c[2]=new Cylinder(2,4);
       
       for(Cylinder s:c){
         System.out.println(s);
       }
       
    }
}