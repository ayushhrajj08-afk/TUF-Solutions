class Solution {
    public int countDigit(int n) {
        int digits=0;
        int neg= -1*n;
        if(n==0){
            return 1;
        }
        else if (n<0) {
            while (neg!=0) {
                // digits++;
                neg=neg/10;
                digits++;
            }
        }
        else{
            while (n!=0) {
                // digits++;
                n=n/10;
                digits++;
            }
        }
        return digits;
    }
}