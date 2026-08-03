class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] pCount = new int[28];
        int[] sCount =new int[28];
        //make ArrayList
        List<Integer> result=new ArrayList<>();
        //make freq
        for(char c: p.toCharArray()){
            pCount[c - 'a']++;
        }

        //populate s
        for(int i=0; i<s.length();i++){
            sCount[s.charAt(i) - 'a']++;
        
        // remove if char is out of string
        if(i>=p.length()){
            sCount[s.charAt(i - p.length()) - 'a']--;
        }
        
        if(Arrays.equals(sCount,pCount)){
            result.add(i-p.length()+1);
        }
        }
        return result;

    }
}