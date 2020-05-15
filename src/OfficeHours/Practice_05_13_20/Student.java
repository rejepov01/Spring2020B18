package OfficeHours.Practice_05_13_20;

public class Student {
    /*
    Student:
             instance variables: name , id
             instance methods: toString
     */

    String name;
    long id;
    static String schoolName = "Cybertek";

    public  String toString (){
        return "Name: "+name+", id: "+id+", School Name: "+schoolName;
    }

    public static void printSchoolName (){
        System.out.println(schoolName + " School");
    }
}


class StudentObject{

    public static void main(String[] args) {
        Student student1 = new Student();
                student1.name = "Leyla";
                student1.id = 123;

                Student student2 = new Student();
                        student2.name = "Mesud";
                        student2.id = 456;

        System.out.println(student1);
        System.out.println(student2);
    }
}