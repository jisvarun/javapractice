package org.example.arraylistquestions;

import java.util.ArrayList;
import java.util.Collections;

class SmartStudent implements Comparable<SmartStudent> {
    String name;
    int marks;

    public SmartStudent(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(SmartStudent other){
        return other.marks - this.marks;
    }
}

public class Q9_SortCustomObjects {
    public static void main(String[] args) {
        ArrayList<SmartStudent> list = new ArrayList<>();
        list.add(new SmartStudent("Aman", 75));
        list.add(new SmartStudent("Divya", 95));
        list.add(new SmartStudent("Rohan", 82));

        Collections.sort(list);

        System.out.println("Rank list (High to Low Marks):");
        for(SmartStudent s : list){
            System.out.println(s.name + " - " + s.marks);
        }
    }
}
