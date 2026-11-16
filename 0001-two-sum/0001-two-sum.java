class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] x= new int[2];
        for(int t=0;t<nums.length-1;t+=1){
            for(int j=t+1;j<=nums.length-1;j++){
                if(nums[t]+nums[j]==target){
                    x[0]=t;
                    x[1]=j;
                }
            }
        }
        return x;
    }
}