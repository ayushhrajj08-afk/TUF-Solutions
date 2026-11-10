class Solution {
    public void sortZeroOneTwo(int[] nums) {
        int count0=0,count1=0,count2=0;
        for(int i:nums){
            if(i==0){
                count0++;
            }
            else if(i==1){
                count1++;
            }
            else{
                count2++;
            }
        }
        for(int j=0;j<count0;j++){
            nums[j]=0;
        }
        for(int k=count0;k<count1+count0;k++){
            nums[k]=1;
        }
        for(int l=count0+count1;l<nums.length;l++){
            nums[l]=2;
        }
    }
}