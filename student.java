class Student{
  
    String name="";
    int rollNo=0;
    String course="";
    int m1=0,m2=0,m3=0;

    public int total(){
        return m1+m2+m3;
    }
    public double average(){
        return (total()/3);
    }
    public String grade(){
        if(average()>=80 ){
            return "A";
        }
        else if(average()>=50 && average()<=79){
            return "B";
        }
        else{
            return "Fail";
        }
    }
    public String toString(){
        return "roll number :"+rollNo+" \nName :"+name+" \nCourse :"+course;
    }
}
class Program85{
    public static void main(String[] args){
        Student s1=new Student();
        s1.m1=70;
        s1.m2=70;
        s1.m3=73;
        s1.rollNo=23;
        s1.name="Payal";
        s1.course="IT";
        System.out.println("Information of student :\n"+s1);
        System.out.println("Total of marks is:\n"+s1.total());
        System.out.println("Avearage of marks is:\n"+s1.average());
        System.out.println("Grade of marks is:\n"+s1.grade());
       

    }
}