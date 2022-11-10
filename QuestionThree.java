package org.example;

import java.util.LinkedList;
import java.util.List;

public class QuestionThree {
    public static void main(String[] args) {
        List<String>
                list = new LinkedList<String>();

        list.add("No");
        list.add("matter");
        list.add("what");
        list.add("you");
        list.add("do");

        System.out.println("Original List: " + list);

        list.subList(3,4).clear();
        list.subList(2, 3).clear();


        System.out.println("Final List: " + list);
    }
}
