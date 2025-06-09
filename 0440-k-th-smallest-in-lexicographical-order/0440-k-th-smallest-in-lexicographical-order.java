class Solution {
    public int findKthNumber(int n, int k) {
        long prefix = 1; // Start with the prefix "1" (the smallest possible number). Use long to avoid overflow!
        k--; // Adjust k because we're using 0-based indexing internally (easier to work with).

        while (k > 0) {
            // Main loop: Continue searching until we find the k-th number.

            long subtSize = 0; // Initialize the size of the subtree (the number of numbers starting with the current prefix).
            long curr = prefix; // Start with the current prefix.
            long next = prefix + 1; // The next possible prefix.  Used for calculating the subtree size.

            while (curr <= n) {
                // Inner loop: Calculate the size of the subtree starting with the current prefix.
                subtSize += Math.min(n + 1, next) - curr; 
                // Add the number of numbers that fall within the range [curr, min(n+1, next)). 
                // Math.min(n + 1, next) makes sure we don't count numbers larger than n.
                curr *= 10; // Move to the next level of the subtree (e.g., 1 -> 10).
                next *= 10; // Update the next prefix as well.
            }

            if (subtSize <= k) {
                // If the subtree size is smaller than or equal to k, it means the k-th number is NOT in this subtree.
                prefix++; // Move to the next prefix.
                k -= subtSize; // Reduce k by the size of the skipped subtree.
            } else {
                // If the subtree size is greater than k, it means the k-th number IS in this subtree.
                prefix *= 10; // "Go deeper" into the subtree (e.g., 1 -> 10).
                k--; // Reduce k by 1 because we're choosing the current prefix (k-th number is within its "children").
            }
        }

        return (int) prefix;
    }
}