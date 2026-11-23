class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp=new HashMap<>();
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(mp.containsKey(diff)) {
                result[0]=mp.get(diff);
                result[1]=i;
                return result;
            }
            mp.put(nums[i],i);
        }
        return result;
    }
}
