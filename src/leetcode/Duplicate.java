package leetcode;

import java.util.HashMap;
import java.util.Map;

//Input: nums = [1,2,3,1]
//
//Output: true

public class Duplicate {
    public boolean containsDuplicate(int[] nums) {

        Map<Integer, Integer> numMap=new HashMap<Integer, Integer>();

        for(int i=0;i<nums.length;i++) {
            if(numMap.containsKey(nums[i])){
                numMap.put(nums[i],numMap.get(nums[i])+1);
                return true;
            }
            numMap.put(nums[i],1);


        }
        return false;



    }
}
