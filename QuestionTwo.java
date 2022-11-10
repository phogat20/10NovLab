package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class QuestionTwo {

    public static void main(String[] args) {
        LinkedHashSet<Integer> setOne = new LinkedHashSet<>();
        LinkedHashSet<Integer> setTwo = new LinkedHashSet<>();
        setOne.add(35);
        setOne.add(19);
        setOne.add(11);
        setOne.add(83);
        setOne.add(7);
        System.out.println("First set of Numbers" + setOne);

        setTwo.add(3);
        setTwo.add(19);
        setTwo.add(11);
        setTwo.add(0);
        setTwo.add(7);
        System.out.println("Second set of Numbers" + setTwo);


        setOne.removeAll(setTwo);
        System.out.println(setOne);

    }

}
