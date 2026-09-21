class Solution {
    public int maxSubArray(int[] nums) {
        // Approach Brute Force
        // TC: O(n*2)
        // SC: O(1)
        int currSum=0;
        int maxSum=nums[0];
        int n=nums.length;
        for(int num :nums){
            if(currSum<0) {currSum=0;}
            currSum+=num;
            maxSum=Math.max(maxSum,currSum);
        }
        return maxSum;
    }
}
