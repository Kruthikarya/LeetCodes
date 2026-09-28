class Solution {
    public int reverseBits(int n) {
        int bits=0;
        for(int i=0;i<32;i++){
            bits<<=1;
            bits |= (n&1);
            n>>=1;
        }
        return bits;
    }
}