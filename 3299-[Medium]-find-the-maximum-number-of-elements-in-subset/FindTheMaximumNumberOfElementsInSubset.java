class Solution {
    public int maximumLength(int[] nums) {
        int n = nums.length;

        int oneCount = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele, 0) + 1);
            if(ele == 1) oneCount++;
        }

        int ans;
        if(oneCount % 2 == 1) ans = oneCount;
        else ans = oneCount - 1;

        for(int x : map.keySet()){
            if(x == 1) continue;

            int pairs = 0;
            int curr = x;

            while(map.getOrDefault(curr, 0) >= 2){
                pairs++;
                curr *= curr;
            }

            int len;
            if(map.getOrDefault(curr, 0) >= 1) len = pairs * 2 + 1;
            else{
                if(pairs == 0) continue;
                len = (pairs - 1) * 2 + 1;
            }

            ans = Math.max(ans, len);
        }

        return ans;
    }
}