class Solution {
    public int countValidPrefixes(String s) {
        StringBuilder sb = new StringBuilder();

        int ans = 0;
        int ones = 0, zeros = 0;
        for(char ch : s.toCharArray()){
            if(ch == '0') zeros++;
            else ones++;
            if((Math.abs(ones - zeros) == 1) || (ones == zeros)) ans++;
        }

        return ans;
    }
}