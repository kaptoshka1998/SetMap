package ru.skypro;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Collections.sort(nums);
        Set<Integer> number = new HashSet<>(nums);
        for (Integer num : number) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // Задание 2
        List<Integer> numss = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Collections.sort(numss);
        Set<Integer> numbers = new HashSet<>(numss);
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // Задание 3
        List<String> fruits = new ArrayList<>(List.of("apple", "orange", "apple", "banana", "orange", "mango", "pear", "banana"));
        Set<String> fruit = new HashSet<>(fruits);
        for (String num : fruit) {
            System.out.print(num + " ");
        }
        System.out.println();


        // Задание 4
        List<String> fruitss = new ArrayList<>(List.of("apple", "orange", "apple", "banana", "orange", "mango", "pear", "banana"));
        Map<String, Integer> counter = new HashMap<>();
        for (String s : fruitss) {
            if (!counter.containsKey(s)) {
                counter.put(s, 1);
            } else {
                counter.put(s, counter.get(s) + 1);
            }
        }
        for (Map.Entry<String, Integer> word : counter.entrySet()) {
            if (word.getValue() >= 2) {
                System.out.println("Слово " + word.getKey() + " встречается " + word.getValue() + " раз(а)");
            }
        }
    }
}


