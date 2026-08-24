class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            String binary = Integer.toBinaryString(ch);
        
            while(binary.length() < 8) binary = "0" + binary;

            sb.append(binary);
        }

        int i=0;
        int j=sb.length() - 1;

        while(i < j){
            if(sb.charAt(i) != sb.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }
}