class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Approach 1 : Nested Loops
        // TC : O(N*2) 
        // SC: O(N)
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target) return new int[]{i,j};
        //     }
        // }
        // return new int[]{};

        // Approach 2 : HashMap
        // TC : O(N) 
        // SC: O(N)
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(mp.containsKey(diff) && mp.get(diff) !=i){
                return new int[]{i,mp.get(diff)};
            }
        }
        return new int[]{};
    }
}
