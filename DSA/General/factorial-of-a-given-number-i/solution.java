class Solution {
    public int factorial(int n) {
        int ans=1;
        if(n==0){
            return 1;
        }
        else{
            for(int i=2;i<=n;i++){
                ans=ans*i;
            }
        }
        return ans;
    }
}