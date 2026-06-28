class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        int largest = 1;
        arr[0] = 1;
        for(int i=1 ; i<n ; i++){
            if(arr[i] == arr[i-1] + 1 || arr[i] == arr[i-1]);
            else arr[i] = arr[i-1] + 1;
            largest = Math.max(largest, arr[i]);
        }

        return largest;
    }
}