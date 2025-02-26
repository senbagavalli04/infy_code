//CODE LINK : https://www.geeksforgeeks.org/problems/largest-number-formed-from-an-array1117/1


//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline
        while (t-- > 0) {
            String input = sc.nextLine();
            String[] numbers = input.split(" ");
            int[] arr = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                arr[i] = Integer.parseInt(numbers[i]);
            }

            Solution ob = new Solution();
            String ans = ob.findLargest(arr);
            System.out.println(ans);
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    String findLargest(int[] arr) {
        int n = arr.length;
       String[] str = new String[n];
       for(int i=0;i<n;i++){
           str[i] = String.valueOf(arr[i]);
       }

    Arrays.sort(str, (a,b) -> (b+a).compareTo(a+b));
    if(str[0].equals("0")) return "0";
       
       
      StringBuilder res = new StringBuilder();
      for(String i : str){
          res.append(i);
      }  
         return res.toString();
  
    } 
       
}
