import java.util.*;
class Parent{
    public Parent(){
         System.out.println("Parent class");
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("Child class");
    }
}
class GrandChild extends Child{
    public GrandChild(){
         System.out.println("Grand Child class");
    }
}
class Program92{
    public static void main(String[] args){
        GrandChild g=new GrandChild();
    }
}