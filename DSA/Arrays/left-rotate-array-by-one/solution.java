class Solution {
    public void rotateArrayByOne(int[] nums) {
        int temp=nums[0];
        for(int j=0;j<nums.length-1;j++){
            nums[j]=nums[j+1];
        }
        nums[nums.length-1]=temp;
    }
}