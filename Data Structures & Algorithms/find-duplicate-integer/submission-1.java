class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> ss=new HashSet<>();
        for(int n:nums) {
            if(ss.contains(n)){ return n; }
            ss.add(n);
        }
        return -1;
    }
}
