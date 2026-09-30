class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> ss=new HashSet<>();
        for(int i:nums){
            ss.add(i);
        }
        int longest=0;
        for(int n:ss){
            if(!ss.contains(n-1)){
                int len=1;
                while(ss.contains(n+len)) len++;
                longest=Math.max(longest,len);
            }
        }
        return longest;
    }
}
