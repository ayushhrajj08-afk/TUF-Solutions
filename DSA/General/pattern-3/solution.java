class Solution {
    public void pattern3(int n) {
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}