class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList= new ArrayList<>();
        backtrack(resultList,nums,new ArrayList<>());
        return resultList;
    }
    public void backtrack(List<List<Integer>> resultList,int[]nums, ArrayList<Integer> Templist){
        //base case
        if(Templist.size()==nums.length){
            resultList.add(new ArrayList<>(Templist));
            return;
        } 
        
// add to the list 
for( int numb: nums){
if(Templist.contains(numb)){
    continue;
}


// add to the list 
Templist.add(numb);

//backtrack
backtrack(resultList, nums,Templist);

//remove it
Templist.remove(Templist.size()-1);

}





    }
}