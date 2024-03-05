class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals,(a,b) ->a[0]-b[0]);
        
        if(intervals.length==0 || intervals==null)  // [[1,3],[2,6],[8,10],[15,18]]
            return res.toArray(new int [0][]);
        int start=intervals[0][0]; // 1
        int end=intervals[0][1]; // 3
        for(int n[]: intervals)  // 15,18  
        {
            if( n[0]<=end) // 15 <10 
            {
                end =Math.max(end,n[1] );// if next da 1st is smaller it means ki end nu update karo with 6 coz sorted he sara
            }
            else // koi overlap ni he ta make new start and end 
            {  
            res.add(new int[]{start, end}); //[1,6],[8,10]  
              // har varji jado vi no over lap hona va  first add in list then update the start and end
                start= n[0]; // 15
            end=n[1]; //18
            }
        }
        res.add(new  int[]{start,end});  // [1,6],[8,10] ,[15,18] 
      // see pala veekho fir next step ich add karna he element so 
      // jado last ele ele hove ga oonu kide naal check kara ge ? no one 
      // oonu directly add karna paina va 
      // aa odo add kare ga jadoo loop break hoju gi ie when it will reach last element
        return res.toArray(new int [0][]);
}
}