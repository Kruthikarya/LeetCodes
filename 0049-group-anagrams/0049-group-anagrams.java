class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //create a map
        HashMap<String,List<String>> map=new HashMap<>();
       for(String val : strs){
        char[] ch= val.toCharArray();
        Arrays.sort(ch);
        String newkey = new String(ch);
        map.computeIfAbsent(newkey, k-> new ArrayList()).add(val);
       }  
       return new ArrayList<>(map.values()); 
    }
}