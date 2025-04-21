package com.codes.ps;

import java.util.Arrays;

public class ValidAnagram {


    public static void main(String[] args) {
        String s = "anaaagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));


    }

    public static boolean isAnagram(String s, String t) {
        //convert string to char array and sort it

        char[] charArray1 = s.toCharArray();
        Arrays.sort(charArray1);
        String sorted = new String(charArray1);
        char[] charArray2 = t.toCharArray();
        Arrays.sort(charArray2);
        String sorted2 = new String(charArray2);


        if (sorted.equals(sorted2))
            return true;
        else
            return false;

    }
}
