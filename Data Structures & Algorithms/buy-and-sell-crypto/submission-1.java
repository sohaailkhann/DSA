class Solution {
    public int maxProfit(int[] prices) {
        // Approach Two Pointer
        // TC: O(N)
        // SC: O(1)
         int left=0;
        int right=1;
        int len=prices.length;
        int maxProfit=0;
        while(right<len){
            if(prices[left]<prices[right]){
                maxProfit=Math.max(maxProfit,prices[right]-prices[left]);
            }else{
                left=right;
            }
            right++;
        }
        return maxProfit;
    }
}
