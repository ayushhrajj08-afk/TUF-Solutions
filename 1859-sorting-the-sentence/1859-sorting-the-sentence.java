class Solution {
    public String sortSentence(String s) {
        String []brr=s.split(" ");
        String []xrr=new String[brr.length];
       for (String ring : brr) {
            for(int i=0;i<brr.length;i++){
                String c=String.valueOf(i+1);
                if(ring.endsWith(c)){
                    xrr[i]=ring.substring(0, ring.length()-1);
                }
            }
        }
        String ruth="";
        for (int i = 0; i < xrr.length; i++) {
            ruth=ruth+xrr[i]+" ";
        }
        ruth=ruth.trim();
        return ruth;
    }
}