class Solution {
    public int reverse(int x) {
        long rev=0;
        int neg=-1*x;
        if(x==0){
            return 0;
        }
        else if(x>0){
            while(x!=0){
                int digit=x%10;
                rev= rev*10+digit;
                x=x/10;
            }
        }
        else{
            while(neg!=0){
                int digit=neg%10;
                rev= rev*10+digit;
                neg=neg/10;
            }
            rev=-1*rev;
        }
        if(rev>=Integer.MAX_VALUE || rev<=Integer.MIN_VALUE){
            return 0;
        }

        return (int)rev;
    }
}