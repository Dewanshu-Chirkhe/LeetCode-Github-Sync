class Solution {
    public int search(int[] arr, int k) {
        int n = arr.length;

        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == k) return mid;
            else if(arr[mid] <= arr[high]){  //right sorted part(mid to high sorted)
                if(arr[mid] < k && arr[high] >= k) low = mid + 1;
                else high = mid - 1;
            }
            else{                            //left sorted part(low to mid sorted)
                if(arr[mid] > k && arr[low] <= k) high = mid - 1;
                else low = mid + 1;
            }
        }

        return -1;
    }
}