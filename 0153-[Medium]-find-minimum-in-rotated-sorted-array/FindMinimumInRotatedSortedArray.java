class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;

        int low = 0;
        int high = n-1;
        int min = Integer.MAX_VALUE;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] <= arr[high]){
                min = Math.min(min , arr[mid]);
                high = mid - 1;
            }
            else low = mid + 1;
        }
        
        return min;
    }
}