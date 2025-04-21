package com.codes.ps;

public class Test {

    public static void main(String[] args) {
        String email = "sw.at+i@gmail.com";

        String l = email.substring(0, email.indexOf("@"));

        String local = l.substring(0, email.indexOf("+"));


        StringBuilder s = new StringBuilder();
        for (int i = 0; i < local.length(); i++) {
            if (local.charAt(i) == '.')
                continue;
            else
                s.append(local.charAt(i));

        }
        String res = s.toString();
        System.out.println(res);

    }
}
