class Solution {
    public int[] getRange(int num){
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        while(num > 0){
            int last = num % 10;
            smallest = Math.min(smallest, last);
            largest = Math.max(largest, last);
            num /= 10;
        }

        return new int[]{largest, smallest};
    }
    public int maxDigitRange(int[] nums) {
        int sum = 0;
        int largestRange = 0;
        
        for(int ele : nums){
            int[] range = getRange(ele);
            int largest = range[0];
            int smallest = range[1];
            int diff = largest - smallest;
            if(diff > largestRange){
                largestRange = diff;
                sum = ele;
            }
            else if(diff == largestRange) sum += ele;
        }

        return sum;
    }
}