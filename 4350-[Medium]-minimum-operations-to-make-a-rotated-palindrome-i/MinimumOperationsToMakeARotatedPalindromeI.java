class Solution {
    public int minOperations(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        int minCost = Integer.MAX_VALUE;

        // r = rotations
        for(int r=0 ; r<n ; r++){
            int i=0, j=sb.length()-1;
            int cost = 0;
            while(i < j){
                char a = sb.charAt(i);
                char b = sb.charAt(j);
                cost += Math.min(Math.abs(a - b), 26 - Math.abs(a - b));
                i++;
                j--;
            }

            minCost = Math.min(minCost, r + cost);

            char firstChar = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(firstChar);
        }

        return minCost;
    }
}