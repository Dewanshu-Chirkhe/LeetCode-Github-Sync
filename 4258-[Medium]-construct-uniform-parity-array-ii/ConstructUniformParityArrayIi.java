class Solution {
    public boolean uniformArray(int[] nums1) {
        Arrays.sort(nums1);
        int min = nums1[0];

        if(min % 2 == 0){
            for(int x : nums1){
                if(x % 2 != 0) return false;
            }
            return true;
        }
        else{
            for(int x : nums1){
                if(x % 2 == 0 && x <= min) return false;
            }
            return true;
        }
    }
}