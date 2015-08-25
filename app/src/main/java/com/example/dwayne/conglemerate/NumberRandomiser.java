package com.example.dwayne.conglemerate;

import android.support.v4.app.Fragment;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Dwayne on 2015/08/25.
 */
public class NumberRandomiser {
        public static Integer[] getRandomNumbers() {
            ArrayList<Integer> randomNumbers = new ArrayList<>();
            boolean hasTenNumbers = false;
            while (!hasTenNumbers) {
                Random randomizer = new Random();
                int nextNum = randomizer.nextInt(10);
                if (!randomNumbers.contains(nextNum)) {
                    randomNumbers.add(nextNum);
                    System.out.println(nextNum);
                }
                if (randomNumbers.size() > 9)
                    hasTenNumbers = true;
            }
            Integer[] array = new Integer[randomNumbers.size()];
            randomNumbers.toArray(array);
            return array;
}}
