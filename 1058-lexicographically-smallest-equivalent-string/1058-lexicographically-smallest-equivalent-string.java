class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {

         int[] parent = new int[26];

        // Initialize each character to be its own parent
        for (int i = 0; i < 26; i++) {
            parent[i] = i;
        }

        // Union characters from s1 and s2
        for (int i = 0; i < s1.length(); i++) {
            int a = s1.charAt(i) - 'a';
            int b = s2.charAt(i) - 'a';

            int pa = find(parent, a);
            int pb = find(parent, b);

            // Attach larger lex parent to smaller
            if (pa < pb) {
                parent[pb] = pa;
            } else if (pb < pa) {
                parent[pa] = pb;
            }
        }

        // Build result from baseStr
        StringBuilder result = new StringBuilder();
        for (char ch : baseStr.toCharArray()) {
            int root = find(parent, ch - 'a');
            result.append((char)(root + 'a'));
        }

        return result.toString();
    }

    // Find with path compression
    private int find(int[] parent, int x) {
        if (parent[x] != x) {
            parent[x] = find(parent, parent[x]);
        }
        return parent[x];
    }
}