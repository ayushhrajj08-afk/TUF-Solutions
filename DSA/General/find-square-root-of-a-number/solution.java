class Solution {
    public int floorSqrt(int n) {
        int root=0;
        for (long i = 1; i * i <= n; i++) { 
            root = (int) i;
        }
        return root;
    }
}