class Solution {
    public int numberOfSpecialChars(String word) {
        int n = word.length();
        int count = 0;
        Set<Character> set = new HashSet<>();

        for(int i=0 ; i<n ; i++){
            char ch = word.charAt(i);
            if(set.contains(ch)) continue;
            else{
                if(Character.isLowerCase(ch)){
                    for(int j=0 ; j<n ; j++){
                        if(word.charAt(j) == Character.toUpperCase(ch)){
                            count++;
                            set.add(ch);
                            break;
                        }
                    }
                }
            }
        }

        return count;
    }
}