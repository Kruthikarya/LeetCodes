class Solution {
    public int[][] merge(int[][] intervals) {
      Arrays.sort(intervals,(a,b)->a[0]-b[0]);
      int start=intervals[0][0];
      int end=intervals[0][1];
      List<int[]>result= new ArrayList<>();
      for(int i=1; i<intervals.length; i++){
        int s=intervals[i][0];
        int e=intervals[i][1];
        if(s<=end){
            //eaxct end
            end=Math.max(e,end);
            //move forward w.r.t ->s and e
        }else{
            result.add(new int[]{start,end});
            start=s;
            end=e;
        }
      }
       result.add(new int[]{start,end});
       return result.toArray(new int[result.size()][]);
    }
}