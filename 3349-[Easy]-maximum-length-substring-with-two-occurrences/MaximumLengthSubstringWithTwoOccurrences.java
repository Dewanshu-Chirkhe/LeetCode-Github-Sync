class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;

        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<=n ; j++){
                String sub = s.substring(i, j);
                for(char ch : sub.toCharArray()){
                    map.put(ch, map.getOrDefault(ch, 0) + 1);
                }

                boolean valid = true;
                for(int val : map.values()){
                    if(val > 2){
                        valid = false;
                        break;
                    }
                }

                if(valid) ans = Math.max(ans, j-i);

                map.clear();
            }
        }

        return ans;
    }
}