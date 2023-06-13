class Super{
    public void display(){
        System.out.println("Super class method");
    }
}
class Sub extends Super{
    public void display(){
        System.out.println("Sub class method");
    }
}

class program93{
    public static void main(String[] args){
        Super s=new Sub();
        s.display();
        s.check();
    }
}