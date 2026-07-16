package org.example.arraylistquestions;

import java.util.ArrayList;

public class FilterEvenNumbers {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        System.out.println("Print number 1 to 10");
        for(int i = 1; i<=10; i++){
            numbers.add(i);
        }

        for(int num : numbers){
            System.out.println(num);
            if(num % 2 == 0){
                evenNumbers.add(num);
            }
        }

        System.out.println("Print even number: ");
        for(int num : evenNumbers){
            System.out.println(num);
        }


    }
}
