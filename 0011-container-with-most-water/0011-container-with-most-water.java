class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxarea=0;
        while(left<right){
                     // calcu the height
                     int h=Math.min(height[left],height[right]);
                     //calcu the width
                     int wid=right-left;
                     //make maxarea calcu
                     maxarea=Math.max(maxarea,h*wid);

                     if(height[left]<height[right]){
                        left++;
                     }else{
                        right--;
                     }
        }
        return maxarea;
    }
}