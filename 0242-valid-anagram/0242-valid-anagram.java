class Solution {

    static HashMap<Character, Integer> makefreq(String str){
       //make a hashmap
       HashMap<Character, Integer> map= new HashMap<>();
       //iteration using for loop
       for(int i=0; i<str.length();i++){
//exact char

char ch=str.charAt(i);
if(!map.containsKey(ch)){
map.put(ch,1);
} else{
    int oldvalue=map.get(ch);
    map.put(ch,oldvalue+1);
}
 }
 return map;
        
    }
    static boolean isAnagram(String st1, String st2){
        //base case
        if(st1.length()!=st2.length())return false;
        HashMap<Character,Integer> freq1=makefreq(st1);
        HashMap<Character,Integer> freq2=makefreq(st2);
        return freq1.equals(freq2);
    }
}