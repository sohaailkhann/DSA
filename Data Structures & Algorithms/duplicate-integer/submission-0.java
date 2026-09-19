class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> ss=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(ss.contains(nums[i])) return true;
            ss.add(nums[i]);
        }
        return false;
    }
}