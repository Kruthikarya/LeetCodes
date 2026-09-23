class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //create a map
        HashMap<String,List<String>> map=new HashMap<>();
        for(String val : strs){
            char[] ch=val.toCharArray();
            Arrays.sort(ch);
            String key= new String(ch);
            map.computeIfAbsent(key,k-> new ArrayList<>()).add(val);
        }
        return new ArrayList<>(map.values());
       
    }
}