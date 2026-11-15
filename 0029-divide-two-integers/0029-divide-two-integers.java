class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        if(dividend==0){
            return 0;
        }
        if(divisor==1){
            return dividend;
        }
        if(divisor==-1){
            return -dividend;
        }
        if(dividend==divisor){
            return 1;
        }
        if(divisor==Integer.MIN_VALUE){
            return 0;
        }
        boolean neg=false;
        if((dividend<0 && divisor>0) || (dividend>0 && divisor<0)){
            neg=true;
        }
        if(dividend>0){
            dividend=-dividend;
        }
        if(divisor>0){
            divisor=-divisor;
        }
        int count=0;
        while(dividend<=divisor){
            dividend-=divisor;
            count++;
        }
        if(neg){
            return -count;
        }
        return count;
    }
}