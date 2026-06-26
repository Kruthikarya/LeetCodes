class Solution {
    public int[][] generateMatrix(int n) {
        int[][]arr=new int[n][n];
        int top=0,bottom=n-1,left=0,right=n-1;
        int count=1;
        while(count<=n*n){
            for(int j=left;j<=right;j++){
              arr[top][j]=count;
              count++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
               arr[i][right]=count;
               count++;
            }

            right--;
            for(int j=right;j>=left;j--){
              arr[bottom][j]=count;
              count++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                arr[i][left]=count;
                count++;
            }
            left++;

            
        }
        return arr;
      }
    }
