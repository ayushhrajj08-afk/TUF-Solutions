class Solution{
    int differenceOfSum(int[]nums){
        int[] cums=nums.clone();
        int dsum=0;
        int esum=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=0){
                int t=nums[i]%10;
                dsum=dsum+t;
                nums[i]/=10;
            }
        }
        for (int j = 0; j < cums.length; j++) {
            esum+=cums[j];
        }
        int q=esum-dsum;
        return q;
    }
}