class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int n = words.length;
        StringBuilder sb = new StringBuilder();

        for(int i=0 ; i<n ; i++){
            String word = words[i];
            int weight = 0;
            for(char ch : word.toCharArray()){
                weight += weights[ch-'a'];
            }
            weight = weight % 26;
            char ch = (char)('z'-weight);
            sb.append(ch);
        }
        
        return sb.toString();
    }
}