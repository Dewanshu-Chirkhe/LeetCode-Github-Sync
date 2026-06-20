class Solution {
    public int minLights(int[] lights) {
        int n = lights.length;
        int[] diff = new int[n+1];

        for(int i=0 ; i<n ; i++){
            int v = lights[i];
            if(v == 0) continue;
            int l = Math.max(0, i-v);
            int r = Math.min(n-1, i+v);
            diff[l]++;
            diff[r+1]--;
        }

        int ans = 0;
        int count = 0;
        int coverage = 0;
        for(int i=0 ; i<n ; i++){
            coverage += diff[i];
            if(coverage > 0){
                ans += (count + 2) / 3;
                count = 0;
            }
            else count++;
        }
        ans += (count + 2) / 3;
        
        return ans;
    }
}