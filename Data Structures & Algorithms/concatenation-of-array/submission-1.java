class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] kk=new int[2*n];
        for(int i=0;i<n;i++){
            kk[i]=nums[i];
            kk[i+n]=nums[i];
        }
        return kk;
    }
}