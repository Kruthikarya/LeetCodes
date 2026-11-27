class Solution {
    public void reverseString(char[] s) {
        
        reversestring(s,0,s.length-1);
    }
   public static void reversestring(char[] s, int left, int right){
    if(left>=right)return;
     char temp=s[left];
     s[left]=s[right];
     s[right]=temp;
     reversestring(s,left+1,right-1);
   }
    }
