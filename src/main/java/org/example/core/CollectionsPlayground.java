package org.example.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class CollectionsPlayground {
    public static void main(String[] args) {
        List<String> advocates = List.of("Ana",
            "Billy",
            "Denys",
            "Heather",
            "Jim",
            "Nicolai");
        List<String> doubleAdvocates = List.of("Ana",
            "Billy",
            "Denys",
            "Heather",
            "Jim",
            "Nicolai",
            "Ana",
            "Billy",
            "Denys",
            "Heather",
            "Jim",
            "Nicolai");
        var managers = List.of("Chad", "David", "Sharat");
        var someAdvocates = List.of("Denys", "Heather");

        Collections.binarySearch(advocates, "Billy");//1
        Collections.max(advocates);//Nicolai
        Collections.min(advocates);//Ana
        Collections.frequency(advocates, "Denys");//1
        Collections.indexOfSubList(advocates, someAdvocates);//2
        Collections.lastIndexOfSubList(doubleAdvocates, someAdvocates);//8
        Collections.disjoint(someAdvocates, managers);//true
        Collections.disjoint(advocates, managers);//false

        //Copying
        var advocatesCopy = new ArrayList<>(List.of("Blank", "Blank", "Blank", "Blank", "Blank", "Blank", "Blank"));

        Collections.copy(advocatesCopy, advocates); //Ana, Billy, Denys, Heather, Jim, Nicolai, Blank
        var copies = Collections.nCopies(3, "Billy");
        Collections.fill(advocates, "Billy");//Billy, Billy, Billy, Billy, Billy, Billy
        Collections.replaceAll(advocates, "Billy", "Nicolai");//Nicolai, Nicolai,Nicolai,Nicolai,Nicolai,Nicolai
        Collections.addAll(advocates, "Jack", "Jill"); //Nicolai, Nicolai,Nicolai,Nicolai,Nicolai,Nicolai, Jack, Jill

        //Reordering
        var reverseString = new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        Collections.sort(advocates);//Ana, Billy, Denys, Heather, Jim, Nicolai
        Collections.sort(advocates, Collections.reverseOrder());//Nicolai, Jim, Heather, Denys, Billy, Ana
        Collections.sort(advocates, Collections.reverseOrder(reverseString));//Ana, Billy, Denys, Heather, Jim, Nicolai
        Collections.reverse(advocates);//Denys, Billy, Ana, Nicolai, Jim, Heather
        Collections.rotate(advocates, 3);//Heather, Jim, Nicolai, Ana, Billy, Denys
        Collections.swap(advocates, 0, advocates.size() -1);// Nicolai, Billy, Denys, Heather, Jim, Ana
        Collections.shuffle(advocates, new Random());

        // Converting collections

        Collections.checkedList(advocates, String.class);
        Collections.enumeration(advocates);
        Collections.unmodifiableList(advocates);
        Collections.synchronizedList(advocates);
        Collections.emptyList();



    }
}
