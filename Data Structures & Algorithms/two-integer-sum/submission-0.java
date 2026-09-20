class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Approach 1 : 
        // TC : O(N*2) 
        // SC: O(N)
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target) return new int[]{i,j};
            }
        }
        return new int[]{};
    }
}
