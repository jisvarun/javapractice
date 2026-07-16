package org.example.arraylistquestions;

import java.util.ArrayList;

public class FindMaxNum {
    public static void main(String[] args){
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(56);
        marks.add(48);
        marks.add(66);
        marks.add(78);
        marks.add(44);

        int max = marks.get(0);
        for(int i = 1; i < marks.size(); i++){
            if(marks.get(i) > max){
                max = marks.get(i);
            }
        }

        System.out.println("Marks list: " + marks);
        System.out.println("Max marks: " + max);
    }
}
