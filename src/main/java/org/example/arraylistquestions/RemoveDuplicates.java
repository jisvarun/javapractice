package org.example.arraylistquestions;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args)
    {
        ArrayList<String> items = new ArrayList<String>();
        items.add("Apple");
        items.add("Banana");
        items.add("Apple");
        items.add("Orange");
        items.add("Banana");

        ArrayList<String> uniqueItems = new ArrayList<String>();
        for(String item : items){
            if(!uniqueItems.contains(item)){
                uniqueItems.add(item);
            }
        }

        System.out.println("Original List: " + items);
        System.out.println("Unique List: " + uniqueItems);
    }
}
