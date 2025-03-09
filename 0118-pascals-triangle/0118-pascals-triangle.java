class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        // Base case: If numRows is 0, return empty triangle
        if (numRows == 0) {
            return triangle;
        }

        // First row is always [1]
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        // Build the rest of the rows
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(i - 1);

            // First element is always 1
            row.add(1);

            // Compute the values in between
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // Last element is always 1
            row.add(1);

            // Add row to the triangle
            triangle.add(row);
        }

        return triangle;


        
    }
}