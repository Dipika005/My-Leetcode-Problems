class Solution {
    public List<String> removeSubfolders(String[] folder) {

        List<String> ans = new ArrayList<>();
        Arrays.sort(folder);  // Sort to ensure parents come before subfolders

        for (String f : folder) {
            if (ans.isEmpty() || !f.startsWith(ans.get(ans.size() - 1) + "/")) {
                ans.add(f);   // Add only if it's not a subfolder
            }
        }

        return ans;
    }
}