class Solution {
    public double[] internalAngles(int[] sides) {
        int a = sides[0];
        int b = sides[1];
        int c = sides[2];
        if(a + b <= c || b + c <= a || a + c <= b){
            return new double[0];
        }

        double[] ans = new double[3];
        ans[0] = Math.toDegrees(Math.acos((b*b + c*c - a*a)/(2.0*b*c)));
        ans[1] = Math.toDegrees(Math.acos((a*a + c*c - b*b)/(2.0*a*c)));
        ans[2] = 180 - ans[0] - ans[1];
        
        Arrays.sort(ans);
        return ans;
    }
}