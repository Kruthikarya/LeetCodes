class Solution {
   public boolean isAlphanum(char c){
    return (c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9');
   }
    public boolean isPalindrome(String s) {
        int n= s.length();
        int left=0;
        int right=n-1;
        while(left<right){
        char c1=s.charAt(left);
            char c2=s.charAt(right);
            if(!isAlphanum(c1)){
                left++;
            }
            else if(!isAlphanum(c2)){
                right--;
            }else {
                if(Character.toLowerCase(c1)!=Character.toLowerCase(c2)){
                return false;
            }
            
            left++;
            right--;
            }

        }
        return true;
    }
}