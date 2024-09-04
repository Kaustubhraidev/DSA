package DSA;

import java.util.HashMap;
import java.util.Map;


class two_sum1 {
    public int[] twoSum (int[] nums, int target){
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();

        for(int i=0; i<n; i++){
            int remaining = target - nums[i];
            if(mp.containsKey(remaining)){
                return new int[]{mp.get(remaining), i};
            }

            mp.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {

    }
}
