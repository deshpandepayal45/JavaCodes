class Car{
    public void changeGear(){
        System.out.println("Gear is changed");
    }
    public void changeSong(){
        System.out.println("Song is changed");
    }
     public void sub()
     {
        System.out.println("displays substraction");
        }
}


class LuxuryCar extends Car{
   
    public void changeGear(){
        System.out.println("Gear changed automatically");
    }

    public void changeSong(){
        System.out.println("Song changed automatically");
    }
    public void add(){
        System.out.println("displays addition");
    }
}


class Program94{
    public static void main(String[] args){
        // Car c=new Car();
        // c.changeGear();
        // c.changeSong();

        // LuxuryCar l=new LuxuryCar();
        // l.changeGear();
        // l.sub();

        Car c=new LuxuryCar();
        c.changeGear();
       // c.add();  ---> it have error because ., child class must have only that methods which
       //are declared inside the super class.


       LuxuryCar l=new Car();
     //  ---> it have error bcoz , we can't create object than refers to base class
    }
}