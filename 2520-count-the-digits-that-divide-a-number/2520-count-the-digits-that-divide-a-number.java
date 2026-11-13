class Solution {
    public int countDigits(int num) {
        int count=0;
        int copy=num;
        if(num<10){
            return 1;
        }
        else{
            while(num!=0){
                int div=num%10;
                if(copy%div==0){
                    count++;
                }
                num=num/10;
            }
        }
        return count;
    }
}