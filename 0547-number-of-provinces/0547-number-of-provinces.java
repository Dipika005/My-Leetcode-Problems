class Solution {

    public static void dfs(int node, ArrayList<Integer> adj[], boolean vis[]) {

        vis[node] = true;
        for (int x : adj[node]) {
            if (vis[x] == false) {
                dfs(x, adj, vis);
            }
        }
    }

    public int findCircleNum(int[][] matrix) {
        int n = matrix.length;
        ArrayList<Integer> adj[] = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            adj[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                if (matrix[i][j] == 1) {
                    adj[i + 1].add(j + 1);
                }
            }
        }

        boolean vis[] = new boolean[n+1];
        for (int i = 0; i < n; i++) {
            vis[i] = false;
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (vis[i] == false){
                dfs(i, adj, vis);
            count++;
            }
        }
    

    return count;
    }

}