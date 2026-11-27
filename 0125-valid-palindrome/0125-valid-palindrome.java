class Solution {
   public boolean isAlphanum(char c){
    return (c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9');
   }
    public boolean isPalindrome(String s) {
    int n=s.length();
    int left=0;
    int right=n-1;
    while(left<=right){
        char ch1=s.charAt(left);
        char ch2=s.charAt(right);
        if(!isAlphanum(ch1)){
            left++;
        }else if(!isAlphanum(ch2)){
            right--;
        }
        else{
            if(Character.toLowerCase(ch1)!=Character.toLowerCase(ch2)){
                return false;
            }
             left++;
        right--;
        }
       
    }
    return true;
}
}