package DSA;

import java.util.*;
//import java.util.Arrays;


public class threesumclosest16 {
//    amazon microsoft meta oracle
    public int threesum(int[] nums, int target){
        int n = nums.length;
        Arrays.sort(nums);
        int closestsum = 100000;
        for(int i=0; i<n-2; i++){
            int l = i+1, r=n-1;
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if(Math.abs(target - sum )< Math.abs(target-closestsum)){
                    closestsum = sum;
                }
                if(sum > target){
                    r--;
                }else{
                    l++;
                }
            }
        }
        return closestsum;
    }
    public static void main(String[] args){
        threesumclosest16 sol = new threesumclosest16();
        int nums[] = {-1,2,1,-4};
        int target = 1;
        int result = sol.threesum(nums, target);
        System.out.println("the closest " + result);
    }
}
