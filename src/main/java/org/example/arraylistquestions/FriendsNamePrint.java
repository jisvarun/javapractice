package org.example.arraylistquestions;

import java.util.ArrayList;

public class FriendsNamePrint {
    public static void main(String[] args){
        ArrayList<String> friends = new ArrayList<String>();
        friends.add("Ram");
        friends.add("Mohan");
        friends.add("Sita");
        friends.add("Puja");

        System.out.println("Friends name:");
        for(String friend : friends){
            System.out.println(friend);
        }
    }
}
