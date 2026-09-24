class Solution {
    public int[] countBits(int n) {
    int[] ans=new int[n+1];
    for(int i=0;i<ans.length;i++){
        ans[i]=bitscount(i);
    }
    return ans;
     }
       public static int bitscount(int num){
        int count=0;
        while(num!=0){
            num =num& (num-1);
            count++;
        }
      return  count;
       }

}