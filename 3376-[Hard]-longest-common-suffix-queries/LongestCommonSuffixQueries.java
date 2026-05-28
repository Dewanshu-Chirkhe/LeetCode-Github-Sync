class TrieNode{
    int idx;
    int len;
    TrieNode[] children = new TrieNode[26];
    TrieNode(){
        idx = -1;
        len = Integer.MAX_VALUE;
    }
}

class Trie{
    TrieNode root;
    Trie(){
        root = new TrieNode();
    }

    void insert(String str, int index){
        TrieNode node = root;
        int length = str.length();

        for(int i=length-1 ; i>=0 ; i--){
            int ch = str.charAt(i) - 'a';
            if(node.children[ch] == null) node.children[ch] = new TrieNode();
            node = node.children[ch];

            if(length < node.len){
                node.len = length;
                node.idx = index;
            }
        }
    }

    int prefix(String query){
        TrieNode node = root;
        int result = -1;

        for(int i=query.length()-1 ; i>=0 ; i--){
            int ch = query.charAt(i) - 'a';
            if(node.children[ch] == null) break;
            node = node.children[ch];
            result = node.idx;
        }

        return result;
    }
}

class Solution {
    public int[] stringIndices(String[] words, String[] queries) {
        Trie trie = new Trie();
        int idx = -1, smallest = Integer.MAX_VALUE;

        for(int i=0 ; i<words.length ; i++){
            trie.insert(words[i], i);
            if(words[i].length() < smallest){
                smallest = words[i].length();
                idx = i;
            }
        }

        int[] ans = new int[queries.length];
        for(int i=0 ; i<queries.length ; i++){
            int index = trie.prefix(queries[i]);
            ans[i] = (index == -1) ? idx : index;
        }

        return ans;
    }
}