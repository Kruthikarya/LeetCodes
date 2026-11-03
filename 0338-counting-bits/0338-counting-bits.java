class Solution {
    public int[] countBits(int n) {
          int[] ans=new int[n+1];
          for(int i=0;i<ans.length;i++){
            ans[i]=sun(i);
          }
          return ans;

        
    
    }
    public int sun(int num){
        int sum=0;
        while(num!=0){
            num=num&(num-1);
            sum++;
        }
       return sum;
    }
}