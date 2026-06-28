class Solution {
    public int removeDuplicates(int[] nums) {
        int ne=0;
        for(int i=0;i<nums.length;i++){
            if(nums[ne]!=nums[i]){
                 ne++;
                nums[ne]=nums[i];
            
            }
      
        }
        return ne+1;
        
    }
}