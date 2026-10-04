class Solution {
    public int minRotations(String s) {
        int ans = 0;
        int curr = 0;
        
        for(char ch : s.toCharArray()){
            int next = ch - '0';

            int diff = Math.abs(next - curr);
            int rotations = Math.min(diff, 10-diff);
            
            System.out.print(rotations+" ");
            ans += rotations;
            curr = next;
        }

        return ans;
    }
}