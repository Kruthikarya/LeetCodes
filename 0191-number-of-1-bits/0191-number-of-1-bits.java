class Solution {
    public int hammingWeight(int n) {
   int bits=0;
   int one=1;
   for(int i=0;i<32;i++){
    if((one & n)!=0){;
    bits++;
   };
   one<<=1;
   }
   return bits;
   
}

    }
   
