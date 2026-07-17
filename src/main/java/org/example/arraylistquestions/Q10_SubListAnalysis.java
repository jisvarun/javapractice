package org.example.arraylistquestions;

import java.util.ArrayList;
import java.util.List;

public class Q10_SubListAnalysis {
    public static void main(String[] args) {
        ArrayList<Integer> mainList = new ArrayList<>();
        for(int i = 10; i <= 100; i += 10){
            mainList.add(i);
        }

        List<Integer> subList = mainList.subList(2, 6);
        System.out.println("Sublist: " + subList);

        int target = 50;
        if (subList.contains(target)) {
            System.out.println(target + " sublist ke andar maujood hai!");
        } else {
            System.out.println(target + " sublist me nahi mila.");
        }
    }
}
