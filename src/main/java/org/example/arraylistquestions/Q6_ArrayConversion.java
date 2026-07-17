package org.example.arraylistquestions;

import java.util.ArrayList;
import java.util.Arrays;

public class Q6_ArrayConversion {
    public static void main(String[] args) {
        String[] colorsArray = {"Red", "Green", "Blue"};

        ArrayList<String> colorsList = new ArrayList<>(Arrays.asList(colorsArray));
        colorsList.add("Yellow");
        System.out.println("ArrayList: " + colorsList);

        String[] newArray = new String[colorsList.size()];
        colorsList.toArray(newArray);

        System.out.println("Convert into Array: " + Arrays.toString(newArray));
    }
}
