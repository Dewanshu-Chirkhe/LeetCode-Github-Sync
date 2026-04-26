class Solution {
    public char getMax(Map<Character, Integer> map, Map<Character, Integer> firstIdx){
        char maxChar = 0;
        int maxFreq = -1;

        for(char ch : map.keySet()){
            if(map.get(ch) > maxFreq){
                maxFreq = map.get(ch);
                maxChar = ch;
            }
            else if(map.get(ch) == maxFreq){
                if(firstIdx.get(ch) < firstIdx.get(maxChar)){
                    maxChar = ch;
                }
            }
        }

        return maxChar;
    }
    public String sortVowels(String s) {
        int n = s.length();
        
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        List<Integer> vowelIdx = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> firstIdx = new HashMap<>();

        for(int i=0 ; i<n ; i++){
            char ch = s.charAt(i);
            if(vowels.contains(ch)){
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                vowelIdx.add(i);
                firstIdx.putIfAbsent(ch, i);
            } 
        }

        StringBuilder sb = new StringBuilder(s);
        int idx = 0;
        while(!map.isEmpty()){
            char ch = getMax(map, firstIdx);

            int count = map.get(ch);
            while(count > 0){
                sb.setCharAt(vowelIdx.get(idx++), ch);
                count--;
            }
            map.remove(ch);
        }
        
        return sb.toString();
    }
}