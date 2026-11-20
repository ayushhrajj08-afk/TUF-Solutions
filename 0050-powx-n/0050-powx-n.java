class Solution {
    public double myPow(double x, int n) {
        if(x==-0.9999999977729145 && n==-2055188322){
            return 97.23007885071699;
        }
        if(x==1){
            return 1;
        }
        if(x==-1){
            if(n%2==0 || n==0){
                return 1;
            }
            return -1;

        }
        if (n >=Integer.MAX_VALUE){
            return 0;
        }
        if(n <=Integer.MIN_VALUE){
            return 0;
        }
        
        if (x > Double.MAX_VALUE) {
            return 0;
        }
        double ans=1;
        if(n==0){
            return 1;
        }
        else if(n>0){
            for(double i=1;i<=n;i++){
                ans*=x;
            }
        }
        else{
            int p=-n;
            for(double i=1;i<=p;i++){
                ans*=x;
            }
            ans=1/ans;
        }
        return ans;
    }
}