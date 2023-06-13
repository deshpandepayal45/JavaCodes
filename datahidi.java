import java.util.*;
//Data hiding
class Rectangle{
    
    private int iLength=0,iBreadth=0;
    public void setLength(int l){
        if(l>0)
             iLength=l;
    }
    public void setBreadth(int b){
        if(b>0)
            iBreadth=b;
    }
    public double getLength(){
        return iLength;
    }
     public double getBreadth(){
        return iBreadth;
    }
    public double Area(){
        
        return iLength*iBreadth;
    }
    public double peripheral(){
        return 2*(iLength+iBreadth);
    }
}
class Program86{
    public static void main(String[] args){
      Rectangle r1=new Rectangle();
       double cAr=0,cPh=0;
       r1.setBreadth(2);
       r1.setLength(23);

       System.out.println("Length of a Rectangle is:\n"+r1.getLength());
       System.out.println("Breadth of a Rectangle is:\n"+r1.getBreadth());
       cAr= r1.Area();
       System.out.println("Area of a Rectangle is:\n"+cAr);
       cPh=r1.peripheral();
       System.out.println("Peripheral of a Rectangle is:\n"+cPh);
    }
}