package org.example.arraylistquestions;

import java.util.ArrayList;
import java.util.Collections;

public class Q7_SortArrayList {
    public static void main(String[] args){
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(85);
        scores.add(12);
        scores.add(55);
        scores.add(99);

        Collections.sort(scores);
        System.out.println("Ascending: " + scores);

        Collections.sort(scores, Collections.reverseOrder());
        System.out.println("Descending: " + scores);
    }
}
