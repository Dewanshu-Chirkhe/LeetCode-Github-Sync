class Solution {
    public int passwordStrength(String password) {
        Set<Character> set = new HashSet<>();
        int strength = 0;
        
        for(char ch : password.toCharArray()){
            if(set.contains(ch)) continue;
            set.add(ch);
            int ascii = (int)ch;
            
            if(Character.isDigit(ch)) strength += 3;
            else if(Character.isLowerCase(ch)) strength += 1;
            else if(Character.isUpperCase(ch)) strength += 2;
            else strength += 5;
        }

        return strength;
    }
}