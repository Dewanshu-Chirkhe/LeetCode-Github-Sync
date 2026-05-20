class Solution {
    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        int n = a.length;
        int[] c = new int[n];
        int[] freq = new int[n+1];
        int common = 0;

        for(int i=0 ; i<n ; i++){
            freq[a[i]] += 1;
            if(freq[a[i]] == 2) common++;

            freq[b[i]] += 1;
            if(freq[b[i]] == 2) common++;

            c[i] = common;
        }

        return c;
    }
}