class Solution {
    public String smallestSubsequence(String s) {
        int[] freq = new int[26];
        boolean[] inStack = new boolean[26];
        char[] charArray = s.toCharArray();
        for(char ch : charArray){
            freq[ch - 'a']++;
        }

        Stack<Character> st = new Stack<>();
        for(char ch : charArray){
            freq[ch - 'a']--;
            if(inStack[ch - 'a']) continue;

            while(!st.isEmpty() && st.peek() > ch && freq[st.peek() - 'a'] > 0){
                char popped = st.pop();
                inStack[popped - 'a'] = false;
            }
            st.push(ch);
            inStack[ch - 'a'] = true;
        }

        StringBuilder ans = new StringBuilder();
        for(char ch : st) ans.append(ch);
        return ans.toString();
    }
}