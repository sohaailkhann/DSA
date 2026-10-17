class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> ss=new HashSet<>();
        for(int n:nums) ss.add(n);
        return ss.size()!=nums.length;
    }
}