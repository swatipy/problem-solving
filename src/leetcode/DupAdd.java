package leetcode;

import java.util.ArrayList;
import java.util.List;

public class DupAdd {

    public static void main(String[] args) {

        int[] nums ={1,2,2,4};


        List<Integer> l = new ArrayList();

        int k = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != k) {
                l.add(nums[i]);
                l.add(k);

            }


            k++;
        }
        int[] res = new int[l.size()];
        System.out.print(l);
        for (Integer i = 0; i < l.size(); i++) {
            res[i] = l.get(i);
        }

        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]);
        }
    }
}