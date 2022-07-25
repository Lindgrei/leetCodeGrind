package leet.wealth.com;

class Solution {

    public int maximumWealth(int[][] accounts) {
        int i = 0, j, sum = 0;
        int m = accounts.length;
        int n = accounts[i].length;
        for (i = 0; i < m; ++i) {
            for (j = 0; j < n; ++j) {

                // Add the element
                sum = sum + accounts[i][j];
            }

            // Print the row sum
            System.out.println("Sum of the row " + i + " = "
                    + sum);

            // Reset the sum
            sum = 0;
        }
        return i;
    }

}
