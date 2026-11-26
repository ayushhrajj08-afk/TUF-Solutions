class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        if(s.length()==1){
            return 1;
        }        
        int count=0;
        int j=s.length()-1;
        while(j>=0 &&s.charAt(j)!=' '){
            j--;
            count++;
        }
        return count;
    }
}