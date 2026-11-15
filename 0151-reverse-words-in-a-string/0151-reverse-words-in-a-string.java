class Solution {
    public String reverseWords(String s) {
         s=s.trim();
        String p="";
        String []grr=s.split("\\s+");
        for(int i=0;i<grr.length;i++){
            grr[i]=grr[i].trim();
        }
        for (int j = grr.length-1; j>=0; j--) {
            p=p+" "+grr[j];
        }
        p=p.trim();
        return p;
    }
}