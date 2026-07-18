class Solution {
    public boolean find132pattern(int[] nums) {


        Stack<Integer> st= new Stack<>();
        int thrid= Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<thrid) return true;
            while( !st.isEmpty()&&st.peek()<nums[i]){
                thrid=st.pop();
            }
            st.push(nums[i]);
        }
        return false;
        
    }
}