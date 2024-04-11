// this solution caused TLE at 136/304 else sol is good brute sol
// On2 time On space 
class Solution{
    public static long[] nextLargerElement(long[] arr, int n){ 
     long ans[]=new long [arr.length ];
     for(int i=0;i<arr.length-1;i++){
         for(int j=i+1;j<arr.length;j++){
             if(arr[i]<arr[j]){
             ans[i]=arr[j];
             break; 
             }
         }
         if(ans[i]==0)
            ans[i]=-1;
     }
     ans[arr.length-1]=-1;
     return ans;
    } 
}


