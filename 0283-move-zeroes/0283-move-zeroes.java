class Solution {
     static void swap(int nums[], int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

    }
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int nonz=0;
        for(int z=0;z<n;z++){
            if(nums[z]!=0){
                swap(nums,nonz,z);
                nonz++;
            }
        }
        
    }
}