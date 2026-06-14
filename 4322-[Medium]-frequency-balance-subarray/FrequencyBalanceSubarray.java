class Solution {
    public boolean isBalance(Map<Integer, Integer> map, int maxFreq){
        if(map.size() == 1) return true;
        if(maxFreq == 1) return false;
        
        int maxFreqCount = 0;
        for(int freq : map.values()) if(freq == maxFreq) maxFreqCount++;
        if(maxFreqCount == map.size()) return false;

        for(int freq : map.values()){
            if(freq == maxFreq) continue;
            if(maxFreq != 2 * freq) return false;
        }

        return true;
    }
    public int getLength(int[] nums) {
        int n = nums.length;
        int maxLen = 1;

        for(int i=0 ; i<n ; i++){
            Map<Integer, Integer> map = new HashMap<>();
            int maxFreq = 0;
            for(int j=i ; j<n ; j++){
                int ele = nums[j];
                map.put(ele, map.getOrDefault(ele, 0) + 1);
                maxFreq = Math.max(maxFreq, map.get(ele));

                if(j - i + 1 <= maxLen) continue;
                if(isBalance(map, maxFreq)){
                    maxLen = j - i + 1;
                }
            } 
        }
        
        return maxLen;
    }
}