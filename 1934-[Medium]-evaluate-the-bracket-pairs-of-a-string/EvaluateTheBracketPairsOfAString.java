class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder ans = new StringBuilder();
        Map<String, String> map = new HashMap<>();

        for(List<String> list : knowledge){
            map.put(list.get(0), list.get(1));
        }

        char[] arr = s.toCharArray();
        
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == '('){
                i++;
                StringBuilder key = new StringBuilder();
                while(i < arr.length && arr[i] != ')'){
                    key.append(arr[i++]);
                }

                System.out.println(key+" "+map.get(key.toString()));

                if(map.containsKey(key.toString())) ans.append(map.get(key.toString()));
                else ans.append('?');
            }
            else ans.append(arr[i]);
        }

        return ans.toString();
    }
}