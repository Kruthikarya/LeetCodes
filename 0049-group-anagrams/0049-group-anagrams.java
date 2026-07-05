class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //create a map
        HashMap<String,List<String>> map=new HashMap<>();
        // iteration  using for loop
        for(String val : strs){
            //exact char from the list of arry
            char[] chars =val.toCharArray();
            //sort
            Arrays.sort(chars);
            //create a key
            String Key= new String(chars);
            map.computeIfAbsent(Key, k -> new ArrayList<>()).add(val);

        }
        return new ArrayList<>(map.values());
    }
}