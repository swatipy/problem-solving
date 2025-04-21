package leetcode;

public class Palindrome {

    public String firstPalindrome(String[] words) {


        for(String s: words) {
            StringBuilder sb=new StringBuilder(s);
            String revString=sb.reverse().toString();

            if(s.equals(revString))
                return s;

        }
        return "";
    }

}



