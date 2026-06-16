class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)) sb.append(ch);
            else if(ch == '*' && sb.length() >= 1) sb.deleteCharAt(sb.length() - 1);
            else if(ch == '#') sb.append(sb.toString());
            else if(ch == '%') sb.reverse();
        }

        return sb.toString();
    }
}