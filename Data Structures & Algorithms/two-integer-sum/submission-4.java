class Solution {
    public int[] twoSum(int[] nums, int target) {
        // O(n)
        Map<Integer,Integer> hh=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x=target-nums[i];
            if(hh.containsKey(x)){
                return new int[]{hh.get(x),i};
            }
            hh.put(nums[i],i);
        }
        return new int[]{};
    }
}
