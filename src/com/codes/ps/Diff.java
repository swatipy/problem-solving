package com.codes.ps;

import java.util.HashMap;
import java.util.Map;

public class Diff {

    public static void main(String[] args) {
        String s = "a";
        String t = "aa";
        System.out.println(findTheDifference(s, t));

        //a   aa'

    }

    public static char findTheDifference(String s, String t) {

        char res = 0;

        Map<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            if (!countMap.containsKey(s.charAt(i))) {
                countMap.put(s.charAt(i), 0);
            } else
                countMap.put(s.charAt(i), countMap.get(s.charAt(i)) + 1);

        }
        for (int i = 0; i < t.length(); i++) {


            if (!countMap.containsKey(t.charAt(i)) || (countMap.get(t.charAt(i)) == 0)) {
                res = t.charAt(i);
                return res;
            } else {
                countMap.put(t.charAt(i), countMap.get(t.charAt(i)) - 1);

            }


        }
        return 0;
    }
}
