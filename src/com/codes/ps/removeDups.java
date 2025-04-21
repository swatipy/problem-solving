package com.codes.ps;

import java.util.HashMap;
import java.util.Map;

public class removeDups {


    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 2};

        Integer res = removeDuplicates(arr);
        System.out.println("Count" + res);


    }


    public static Integer removeDuplicates(int[] nums) {


        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (countMap.containsKey(nums[i])) {
                continue;
            } else {
                count++;
                countMap.put(nums[i], 1);
            }

// countMap.get();
        }


        return count;
    }

    // Given an array {0,0,1,2}
    // Return a Map such that it stores count of each of the elements of the array
    // {0: 2, 1: 1, 2: 1}
//    public static Map<Integer, Integer> countMap(int[] nums) {
//        Map<Integer,Integer> countMap = new HashMap<>();
//        //i=0,1,2,3
//        //countMap {0:1, 1:0,2:0}
//        for (int i:nums) {
//            if(countMap.containsKey(i)) {
//                countMap.put(i,countMap.get(i)+1);
//            } else {
//                countMap.put(i, 1);
//            }
//
//        }
//        return countMap;
//    }
}
