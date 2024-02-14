package problem_list.two_Sum;

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] returnVar = new int[2];
        for (int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if( i!=j && nums[i] + nums[j] == target){
                    returnVar[0] = i;
                    returnVar[1] = j;
                    return returnVar;
                }
            }
        }
        return returnVar;
    }


    public static void main(String[] args){
        int[] nums = {3,5,8,1,7,67,34,2};
        int target = 36;
        
        System.out.println(Arrays.toString(new Solution().twoSum(nums, target)));
    }
}