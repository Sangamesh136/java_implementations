package sangamesh;

import java.util.Arrays;

public class Topic1 {
    public static void main(String[]args){
        Student student1=new Student(1,"sam",20);
        System.out.println(student1.roll);


    }
}
class Student{
    String name;
    int roll;
    float marks;
    Student(int roll,String name,float marks){
        this.roll=roll;
        this.name=name;
        this.marks=marks;

    }
}
