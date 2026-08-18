class Solution {
    public int maximumGap(String skill, String station) {
        int n = skill.length();
        int m = station.length();

        int[] left = new int[n];
        int[] right = new int[n];

        int idx = 0;
        for(int i=0 ; i<n ; i++){
            while(station.charAt(idx) != skill.charAt(i)) idx++;
            left[i] = idx;
            idx++;
        }

        idx = m-1;
        for(int i=n-1 ; i>=0 ; i--){
            while(station.charAt(idx) != skill.charAt(i)) idx--;
            right[i] = idx;
            idx--;
        }

        int maxGap = 0;

        for(int i=1 ; i<n ; i++){
            maxGap = Math.max(maxGap, right[i] - left[i-1]);
        }
        
        return maxGap;
    }
}