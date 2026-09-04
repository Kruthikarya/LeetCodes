class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxarea=0;
        while(left<right){
            //cal height min
            int h=Math.min(height[left],height[right]);
            //cal wid 
            int w=right-left;
            //cal maxarea
            maxarea=Math.max(maxarea,h*w);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }


        }
        return maxarea;
    }
}