package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MissNo {

    public static void main(String[] args){
        int[] nums={0,1,3,4};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {

        List<Integer> arrList= new ArrayList<>();

        for(int i=0; i<nums.length;i++)
        {
            arrList.add(nums[i]);
        }

        for(int i=0;i<=nums.length;i++){
            if(!arrList.contains(i))
                return i;
        }

  return 0;
    }
}
