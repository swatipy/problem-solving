package com.codes.common;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyMapper {

    /*
       Frequency Mapper to store the frequency of all the elements in an array.
    */
    public static void main(String[] args) {

        int sum = 0;
        List<Integer> arr = Arrays.asList(10, 20, 30, 40, 50, 50);

        for (int i = 0; i < arr.size(); i++) {

            sum = sum + arr.get(i);

        }
        System.out.println(sum);

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            //  Update the count in the map
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1); // Increment count
            } else {
                frequencyMap.put(num, 1); // First occurrence, initialize to 1
            }
        }
        System.out.println(frequencyMap);


    }
}