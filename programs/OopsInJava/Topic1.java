

public class Topic1{
    public static void main(String[]args){
        Student student1=new Student(7,"Sangamesh",80.5);
        // System.out.println(student1);
        Student another=new Student(student1);
        System.out.println(another.name);
    }
}
class Student{
    int roll;
    String name;
    double marks;

    Student(int roll,String name,double marks){
        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }
    Student (Student other){
        this.roll=other.roll;
        this.name=other.name;
        this.marks=other.marks;
    }
}