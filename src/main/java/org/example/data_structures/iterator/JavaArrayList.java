package org.example.data_structures.iterator;

import java.util.ArrayList;
import java.util.Collections;

public class JavaArrayList {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        cars.add(0, "Mazda");

//        System.out.println(cars);
//        System.out.println(cars.get(0));
        cars.set(0, "Opel");
//        System.out.println(cars.get(0));
//        cars.remove(0);
//        cars.clear();
//        cars.size();
//        for(int i=0; i<cars.size(); i++){
//            System.out.println(cars.get(i));
//        }

//        for each
//        for (String i : cars) {
//            System.out.println(i);
//        }
        Collections.sort(cars);
        for(String i : cars){
            System.out.println(i);
        }
    }
}
