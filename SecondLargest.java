//{ Driver Code Starts
//Initial Template for Java
import java.util.stream.Collectors; 
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().print2largest(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


// brute sol
// class Solution {
//     int print2largest(int arr[], int n) {
//         Arrays.sort(arr); 
//         int largest=arr[n-1];
//      for(int i=n-2;i>=0;i--){
//          if(arr[i]!=largest) return arr[i];
//      }
//      return -1;
//     }
// }


//best 
class Solution {
    int print2largest(int arr[], int n) {
        int small =-1;
        int large=arr[0];
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]>large){ 
            small=large;
            large=arr[i];
        }
        else if(arr[i]<large && arr[i]>small) 
            small=arr[i];
        }
        
      return small;  
    }
}
//testing 


// #ab #main #reach #ke #liye #hashtags #use #karunga #so #ignore
// #I #said #ignore!
// #arey! #ignore #bhai!
// #Programming #Coding #TechSkills #CodeLife #DeveloperCommunity #SoftwareEngineering #ProgrammingLanguages #CodeCrafting #TechInnovation #CodingSkills #ProgrammerLife #CodeJourney #CodeForFun #ProgrammingWorld #CodeMastery