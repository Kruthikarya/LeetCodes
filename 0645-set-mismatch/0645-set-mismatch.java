class Solution {
    public int[] findErrorNums(int[] nums) {
        //make a array
        int[] result= new int[2];
        //make hashmap
        HashMap<Integer,Integer> map= new HashMap<>();
        //define dul and miss
        int dul=0;
        int miss=0;
        //iteration by for on num eac for
        for(int num: nums){//if already presnt add it
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //for loop again from first
        for(int i=1; i<=nums.length; i++){
            if(map.containsKey(i)){
                if(map.get(i)==2){
                    dul=i;
                }
            }
                else{
                    miss=i;
                }          
        }
         result[0]=dul;
            result[1]=miss;
            return result;
        
    }
}