class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> resultset= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;

            if(nums[index]<0){
                //if it is -ve the you have already madd it, so add it into results
                resultset.add(index+1);
            }else{
        


        //if not -ve and it is first occured then make it negative
          nums[index]=nums[index]*-1;
            }
              
        }
         return resultset;
     
    }
}