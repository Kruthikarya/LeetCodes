class Solution {
        public int sumofdigit(int n){
           int sum=0;
           while(n!=0){
            int digits=n%10;
            n=n/10;
            sum=sum+(digits*digits);
           }
           return sum;
        }
        public boolean  isHappy(int n){
            HashSet<Integer> set= new HashSet<>();
            while(n!=1){
                if(set.contains(n))return false;
                set.add(n);
                n=sumofdigit(n);
            }
            return true;
        }
    }
