class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int leftmax=0;
        int rightmax=0;
        int res=0;
        int l=0;
        int r=n-1;
        while(l<r){
            if(height[l]>leftmax){
                leftmax=Math.max(leftmax,height[l]);
            }
             if(height[r]>rightmax){
                rightmax=Math.max(rightmax,height[r]);
                
            }
            if(leftmax<rightmax){
                res= res+leftmax-height[l];
                l++;

            }else{
                res= res+rightmax-height[r];
                r--;
            }


        }
        return res;
    }
}