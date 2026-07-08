class Solution {
    public int reverseBits(int n) {
        int c = 0;
        for(int i=0; i<32; i++){
            c <<=1;
            c |= (n&1);
            n >>>= 1;
        }
        return c;
    }
}