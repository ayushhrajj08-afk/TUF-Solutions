class Solution {
    boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0;i<=arr.length-3;i++){
            int a=arr[i],b=arr[i+1],c=arr[i+2];
            if (a%2!=0 && b%2!=0 && c%2!=0 ) {
                return true;
            }
        }
        return false;
    }
}