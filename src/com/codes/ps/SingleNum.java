package com.codes.ps;

import java.util.HashMap;
import java.util.Map;

public class SingleNum {

    class Solution {
        public int singleNumber(int[] nums) {

            Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();

            for (int i : nums) {
                if (countMap.containsKey(i)) {
                    countMap.put(i, countMap.get(i) + 1);
                } else {
                    countMap.put(i, 1);
                }

            }

            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {


                if (entry.getValue() == 1) {
                    return entry.getKey();
                }

            }

            return 0;
        }
    }


}
