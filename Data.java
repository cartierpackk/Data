public class Data {
    public static final int MAX = (int) (Math.random() * Integer.MAX_VALUE);
    private int[][] grid;

    public Data(int[][] grid) {
        this.grid = grid;
    }

    /**
     * Fills all elements of grid with randomly generated
     * values, as described in part (a)
     * Precondition: grid is not null.
     * grid has at least one element.
     */
    public void repopulate() {
        for (int i = 0; i < grid[0].length; i++) {
            for (int f = 0; f < grid.length; f++) {
                int num = 0;
                while (num % 10 == 0 && num % 100 != 0) {
                    num = (int) (Math.random() * MAX) + 1;
                }
                grid[f][i] = num;
            }
        }
    }


    /**
     * Returns the number of columns in
     * grid that are in increasing order, as
     * described in part (b)
     * Precondition: grid is not null.
     * grid has at least one element.
     */
    public int countIncreasingCols() {
        int count = 0;
        if (grid.length == 1) return 1;
        for (int col = 0; col < grid[0].length; col++) {
            boolean increasing = true;
            for (int row = 0; row < grid.length - 1; row++) {
                if (grid[row][col] > grid[row + 1][col]) {
                    increasing = false;
                }
            }
            if (increasing) count++;
        }
        return count;
    }

    // There may be instance variables, constructors
    //and methods that are not shown.
}
