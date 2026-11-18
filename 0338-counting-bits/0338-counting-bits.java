class Solution {
    public int[] countBits(int n) {
         int[] arr= new int[n+1];
         for(int i=0;i<arr.length;i++){
            arr[i]=whole(i);
         }
         return arr;
    
    }
    public static int whole(int num){
        int sum=0;
        while(num!=0){
            num=num &(num-1);
            sum++;
        }
        return sum;
    }
}