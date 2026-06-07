class Solution {
    public void compute(int idx, int n, int k, int cost, StringBuilder sb, List<String> list){
        if(cost > k) return;

        if(idx == n && cost <= k){
            list.add(sb.toString());
            return;
        }

        sb.append('0');
        compute(idx+1, n, k, cost, sb, list);
        sb.deleteCharAt(sb.length() - 1);

        if(idx == 0 || sb.charAt(sb.length() - 1) != '1'){
            sb.append('1');
            compute(idx+1, n, k, cost+idx, sb, list);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    public List<String> generateValidStrings(int n, int k) {
        List<String> list = new ArrayList<>();
        compute(0, n, k, 0, new StringBuilder(), list);
        return list;
    }
}