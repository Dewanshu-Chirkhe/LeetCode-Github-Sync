class Solution {
    public boolean consecutiveSetBits(int n) {
        String binary = Integer.toBinaryString(n);
        int count = 0;
        int len = binary.length();

        for(int i=0 ; i<len-1 ; i++){
            char curr = binary.charAt(i);
            char next = binary.charAt(i+1);
            if(curr == '1' && next == '1') count++;
        }

        return count == 1;
    }
}