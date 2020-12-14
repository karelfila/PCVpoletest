package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>(100);
        List<Integer> array2 = new ArrayList<>(100);

        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            array.add(r.nextInt(100));
        }
        for (int i = 0; i < 100; i++) {
            array2.add(r.nextInt(100));
        }
            Collections.sort(array);
            Collections.sort(array2);

            for (Integer integer : array) {
                System.out.println(integer);
            }
            for (Integer integer : array2) {
                System.out.println(integer);
            }
            if(array != array2){
                System.out.println("Pole se nerovnají");
            } else {
                System.out.println();
            }
    }
}
