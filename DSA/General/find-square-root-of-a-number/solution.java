class Solution {
    public int floorSqrt(int n) {
        int root=0;
        for (long i = 1; i * i <= n; i++) {   // long so i*i can't overflow
            root = (int) i;
        }
        return root;
    }
}