class Solution {
    public int minOperations(String s1, String s2) {
        int n = s1.length();

        if(n == 1){
            char a = s1.charAt(0);
            char b = s2.charAt(0);

            if(a == b) return 0;
            if(a == '1' && b == '0') return -1;
            return 1;
        }
        
        int operations = 0;
        int i = 0;

        while(i < n){
            if(s1.charAt(i) == '0' && s2.charAt(i) == '1'){
                operations++;
                i++;
            }
            else if(s1.charAt(i) == '1' && s2.charAt(i) == '0'){
                int j=i;
                while(j < n && s1.charAt(j) == '1' && s2.charAt(j) == '0'){
                    j++;
                }

                int len = j - i;
                operations += (len % 2 == 0) ? len/2 : (len + 3) / 2;
                i = j;
            }
            else i++;
        }
        
        return operations;
    }
}