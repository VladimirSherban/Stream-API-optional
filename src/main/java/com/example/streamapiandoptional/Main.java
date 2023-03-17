package com.example.streamapiandoptional;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        Random random = new Random();
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            integerList.add(i, random.nextInt(100));
        }

        System.out.println(integerList);

        main.findMinMax(integerList);
        main.findEvenNumbersInList(integerList); // 2 Задание

    }

    private void findMinMax(List<Integer> integerList) {
        Optional<Integer> max = integerList.stream().max(Comparator.naturalOrder());
        Optional<Integer> min = integerList.stream().min(Comparator.naturalOrder());
        System.out.println("Максимальное число - " + max + "\nМинимальное число - " + min);
    }

    private void findEvenNumbersInList(List<Integer> integerList) {
        integerList.stream().filter(integer -> integer % 2 == 0).sorted().forEach(System.out::println);
    }
}
