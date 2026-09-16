class Solution {
    public long sumAndMultiply(int n) {
        String str = Integer.toString(n);
        long digits = 0;
        long sum = 0;

        for(char ch : str.toCharArray()){
            if(ch == '0') continue;
            else{
                int num = ch - '0';
                digits *= 10;
                digits += num;
                sum += num;
            }
        }

        return sum * digits;
    }
}