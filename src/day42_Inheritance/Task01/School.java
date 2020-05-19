package day42_Inheritance.Task01;

import java.util.ArrayList;
import java.util.Arrays;

/*
create a class called school:
					create 3 objects of student and set their info
					create a an ArrayList of students to store all student objects
					use for each loop to print out each students' name and studentID
 */
public class School {

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setStudentInfo("Mesud",5,'M',2564,"Elementary");
        student2.setStudentInfo("Leyla",3,'F',23654,"Pre K");
        student3.setStudentInfo("Ayna",30,'F',5647,"Social Science");

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(student1, student2, student3) );


        for (Student each : studentList ){
           // System.out.println(each);
            System.out.println("Name is: "+each.name+", Student ID: "+each.studentID);
        }


    }
}
