class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int max_len=0;
        List<Character> res= new ArrayList<>();
        while(end<s.length()){
            if(!res.contains(s.charAt(end))){
                res.add(s.charAt(end));
                end++;
                max_len=Math.max(max_len,res.size());
            }else{
                res.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max_len;

    }
}