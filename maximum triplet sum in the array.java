//CODE LINK : https://www.geeksforgeeks.org/problems/maximum-triplet-sum-in-array0129/1


class Solution {
    // Function to find the maximum triplet sum in the array.
    public int maxTripletSum(List<Integer> arr) {
        int n = arr.size();
        Collections.sort(arr);
        return arr.get(n-1)+arr.get(n-2)+arr.get(n-3);
        
        
    }
}

/* 
//{ Driver Code Starts

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        Solution ob = new Solution();

        while (t-- > 0) {
            String line = scanner.nextLine();
            Scanner lineScanner = new Scanner(line);
            List<Integer> nums = new ArrayList<>();
            while (lineScanner.hasNextInt()) {
                nums.add(lineScanner.nextInt());
            }
            System.out.println(ob.maxTripletSum(nums));
        }
        scanner.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find the maximum triplet sum in the array.
    public int maxTripletSum(List<Integer> arr) {
        int maxA = Integer.MIN_VALUE;
        int maxB = Integer.MIN_VALUE;
        int maxC = Integer.MIN_VALUE;
        int n = arr.size();
        for(int i=0;i<n;i++){
            if(arr.get(i) > maxA){
                  maxC = maxB;
                maxB = maxA;
                maxA = arr.get(i);
              
            }
            else if( arr.get(i)>maxB){
              
                maxC = maxB;
                 maxB = arr.get(i);
            }
            else if(arr.get(i)>maxC ){
                maxC= arr.get(i);
            }
            
        }
        return maxA + maxB + maxC;
        
        
        
    }
}
*/
