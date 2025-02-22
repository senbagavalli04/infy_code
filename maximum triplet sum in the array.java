//CODE LINK : https://www.geeksforgeeks.org/problems/maximum-triplet-sum-in-array0129/1


class Solution {
    // Function to find the maximum triplet sum in the array.
    public int maxTripletSum(List<Integer> arr) {
        int n = arr.size();
        Collections.sort(arr);
        return arr.get(n-1)+arr.get(n-2)+arr.get(n-3);
        
        
    }
}
