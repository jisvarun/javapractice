package org.example.arraylistquestions;

import java.util.ArrayList;

class Student{
    int rollNo;
    String name;
    int marks;

    public Student(int rollNo, String name, int marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}

public class Q8_CustomObjectArrayList {
    public static void main(String[] args){
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student(101, "Rahul", 56));
        studentList.add(new Student(102, "Sneha", 88));
        studentList.add(new Student(103, "Vikas", 42));
        studentList.add(new Student(104, "Pooja", 76));

        System.out.println("Students list who obtain 60% or above: ");
        for(Student s : studentList){
            if(s.marks > 60){
                System.out.println(s.name + " (Marks: " + s.marks + ")");
            }
        }

    }
}
