//CODE LINK :https://www.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            t--;

            System.out.println(new Solution().findsum(arr) == true ? "true" : "false");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        Map<Integer,Integer> pre = new HashMap<>();
        int s=0;
        for(int i=0;i<arr.length;i++){
            s+=arr[i];
            if(s==0) return true;
            if (pre.containsKey(s-0)){
                return true;
            }
            pre.put(s,pre.getOrDefault(s,0)+1);
        }
        return false;
    }
}
