package leetcode;

import java.math.BigInteger;

public class plusOne {

public static void main(String[] args){

    int[]digits={1,2,3};

    int[] arr =plusOneM(digits);

    for(int i=0; i<arr.length;i++){


        System.out.println(arr[i]);

    }

}
    public static int[] plusOneM(int[] digits) {
        int res=0;
        StringBuilder num = new StringBuilder();

        for(int i=0; i<digits.length;i++){


            num.append(digits[i]);

        }
        String strNum=num.toString();

//        Integer intNum=Integer.valueOf(strNum);
//        intNum=intNum+1;
        BigInteger intNum = new BigInteger(strNum);
        intNum = intNum.add(BigInteger.ONE);

        String resStr = String.valueOf(intNum);
        System.out.println(resStr);

        int[] resArr= new int[resStr.length()];

        for(int i=0; i<resStr.length();i++){

            resArr[i]= Integer.parseInt(resStr.charAt(i)+"");

        }
        return resArr;

    }
}
