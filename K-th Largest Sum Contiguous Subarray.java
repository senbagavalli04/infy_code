//CODE LINK :https://www.geeksforgeeks.org/problems/k-th-largest-sum-contiguous-subarray/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
class Solution {
    public static int kthLargest(int[] arr, int k) { 
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = arr.length;
        int res = 0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum+= arr[j];
                pq.add(sum);
            }
        }
        while(k>0 && !pq.isEmpty()){
            res = pq.poll();
            k--;
        }
        return res;
        

    }
  
}
