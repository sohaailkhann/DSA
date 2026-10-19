class Solution {
    public int longestConsecutive(int[] nums) {
        int len=nums.length;
        if(len==0) return 0;
        Set<Integer> ll=new HashSet<>();
        for(int n:nums) ll.add(n);
        int max=0;
        int count=0;
        for(int i=0;i<len;i++){
            int q=nums[i];
            if(!ll.contains(q-1)){
                while(ll.contains(q)){ 
                    count++; q++;
                    max=Math.max(max,count);
                }
                count=0;
            }
        }
        return max;
    }
}
