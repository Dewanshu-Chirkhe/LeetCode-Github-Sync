class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();

        for(int ele : arr1){
            while(ele > 0){
                set.add(ele);
                ele /= 10;
            }
        }

        int maxLen = 0;

        for(int ele : arr2){
            int temp = ele;

            while(temp > 0){
                if(set.contains(temp)){
                    int len = Integer.toString(temp).length();
                    maxLen = Math.max(maxLen, len);
                    break;
                }
                temp /= 10;
            }
        }

        return maxLen;
    }
}