class Solution {
    public String smallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        
        int partition = n / 2;
        Arrays.sort(arr, 0, partition);
        for(int i=0 ; i<partition ; i++){
            arr[n - 1 - i] = arr[i];
        }
 
        return new String(arr);
    }
}