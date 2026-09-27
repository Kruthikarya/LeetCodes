class Solution {
    public int hammingWeight(int n) {
        int bits=0;
        //we need a pointer to move 
        int mask=1;
        for(int i=0;i<36;i++){
            if((mask & n)!=0){
                bits++;
            }
            mask<<=1;
        }
         return bits;
}
    }
   
