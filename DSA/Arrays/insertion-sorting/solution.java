class Solution {
    public int[] insertionSort(int[] nums) {
        for(int i=1;i<nums.length;i++){
            int prev=i-1;
            int curr=i;
            int currvalue=nums[curr];
            while(prev>=0 && nums[prev]>currvalue){
                nums[prev+1]=nums[prev];
                prev--;
            }
            nums[prev+1]=currvalue;
        }
        return nums;
    }
}